/** Generated Model - DO NOT CHANGE */
package de.metas.dlm.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for DLM_Partition_Workqueue
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public class X_DLM_Partition_Workqueue extends org.compiere.model.PO implements I_DLM_Partition_Workqueue, org.compiere.model.I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = -945140217L;

    /** Standard Constructor */
    public X_DLM_Partition_Workqueue (Properties ctx, int DLM_Partition_Workqueue_ID, String trxName)
    {
      super (ctx, DLM_Partition_Workqueue_ID, trxName);
      /** if (DLM_Partition_Workqueue_ID == 0)
        {
			setAD_Table_ID (0);
			setDLM_Partition_Workqueue_ID (0);
			setRecord_ID (0);
        } */
    }

    /** Load Constructor */
    public X_DLM_Partition_Workqueue (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }


    /** Load Meta Data */
    @Override
    protected org.compiere.model.POInfo initPO (Properties ctx)
    {
      org.compiere.model.POInfo poi = org.compiere.model.POInfo.getPOInfo (ctx, Table_Name, get_TrxName());
      return poi;
    }

	@Override
	public org.compiere.model.I_AD_Table getAD_Table() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_AD_Table_ID, org.compiere.model.I_AD_Table.class);
	}

	@Override
	public void setAD_Table(org.compiere.model.I_AD_Table AD_Table)
	{
		set_ValueFromPO(COLUMNNAME_AD_Table_ID, org.compiere.model.I_AD_Table.class, AD_Table);
	}

	/** Set DB-Tabelle.
		@param AD_Table_ID 
		Database Table information
	  */
	@Override
	public void setAD_Table_ID (int AD_Table_ID)
	{
		if (AD_Table_ID < 1) 
			set_Value (COLUMNNAME_AD_Table_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
	}

	/** Get DB-Tabelle.
		@return Database Table information
	  */
	@Override
	public int getAD_Table_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	@Override
	public de.metas.dlm.model.I_DLM_Partition getDLM_Partition() throws RuntimeException
	{
		return get_ValueAsPO(COLUMNNAME_DLM_Partition_ID, de.metas.dlm.model.I_DLM_Partition.class);
	}

	@Override
	public void setDLM_Partition(de.metas.dlm.model.I_DLM_Partition DLM_Partition)
	{
		set_ValueFromPO(COLUMNNAME_DLM_Partition_ID, de.metas.dlm.model.I_DLM_Partition.class, DLM_Partition);
	}

	/** Set Partition.
		@param DLM_Partition_ID Partition	  */
	@Override
	public void setDLM_Partition_ID (int DLM_Partition_ID)
	{
		if (DLM_Partition_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_DLM_Partition_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_DLM_Partition_ID, Integer.valueOf(DLM_Partition_ID));
	}

	/** Get Partition.
		@return Partition	  */
	@Override
	public int getDLM_Partition_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DLM_Partition_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Partitionierungswarteschlange.
		@param DLM_Partition_Workqueue_ID Partitionierungswarteschlange	  */
	@Override
	public void setDLM_Partition_Workqueue_ID (int DLM_Partition_Workqueue_ID)
	{
		if (DLM_Partition_Workqueue_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_DLM_Partition_Workqueue_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_DLM_Partition_Workqueue_ID, Integer.valueOf(DLM_Partition_Workqueue_ID));
	}

	/** Get Partitionierungswarteschlange.
		@return Partitionierungswarteschlange	  */
	@Override
	public int getDLM_Partition_Workqueue_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DLM_Partition_Workqueue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Datensatz-ID.
		@param Record_ID 
		Direct internal record ID
	  */
	@Override
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 0) 
			set_Value (COLUMNNAME_Record_ID, null);
		else 
			set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
	}

	/** Get Datensatz-ID.
		@return Direct internal record ID
	  */
	@Override
	public int getRecord_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name der DB-Tabelle.
		@param TableName Name der DB-Tabelle	  */
	@Override
	public void setTableName (java.lang.String TableName)
	{
		throw new IllegalArgumentException ("TableName is virtual column");	}

	/** Get Name der DB-Tabelle.
		@return Name der DB-Tabelle	  */
	@Override
	public java.lang.String getTableName () 
	{
		return (java.lang.String)get_Value(COLUMNNAME_TableName);
	}
}