package de.metas.ui.web.board.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.ImmutableList;

import de.metas.ui.web.board.BoardCard;
import de.metas.ui.web.view.json.JSONViewRowBase;
import de.metas.ui.web.window.datatypes.json.JSONDocumentPath;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

/*
 * #%L
 * metasfresh-webui-api
 * %%
 * Copyright (C) 2017 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@Builder
@Value
public class JSONBoardCard implements JSONViewRowBase
{
	public static JSONBoardCard of(final BoardCard card, final String adLanguage)
	{
		final JSONBoardCardBuilder jsonCard = JSONBoardCard.builder()
				.cardId(card.getCardId())
				.laneId(card.getLaneId())
				//
				.caption(card.getCaption().translate(adLanguage))
				.description(card.getDescription().translate(adLanguage))
				.documentPath(JSONDocumentPath.ofWindowDocumentPath(card.getDocumentPath()));

		// Users
		card.getUsers()
				.stream()
				.map(JSONBoardCardUser::of)
				.forEach(jsonCard::user);

		return jsonCard.build();
	}

	private final int cardId;
	private final int laneId;

	private final String caption;
	private final String description;

	private final JSONDocumentPath documentPath;

	@Singular
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private ImmutableList<JSONBoardCardUser> users;
}
