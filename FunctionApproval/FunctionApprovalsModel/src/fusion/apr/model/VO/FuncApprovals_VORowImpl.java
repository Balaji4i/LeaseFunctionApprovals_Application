package fusion.apr.model.VO;

import java.math.BigDecimal;

import oracle.jbo.RowSet;
import oracle.jbo.domain.BFileDomain;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.RowID;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 09 11:35:17 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FuncApprovals_VORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FuncId {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getFuncId();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setFuncId((Number)value);
            }
        }
        ,
        AttrGrpId {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getAttrGrpId();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setAttrGrpId((Number)value);
            }
        }
        ,
        ActiveYn {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getActiveYn();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setActiveYn((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setLastUpdateLogin((String)value);
            }
        }
        ,
        RowID {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getRowID();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setRowID((RowID)value);
            }
        }
        ,
        Trans_Active {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getTrans_Active();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setTrans_Active((Boolean)value);
            }
        }
        ,
        Functions_ROVO1 {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getFunctions_ROVO1();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Appr_Group_Name_ROVO1 {
            public Object get(FuncApprovals_VORowImpl obj) {
                return obj.getAppr_Group_Name_ROVO1();
            }

            public void put(FuncApprovals_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(FuncApprovals_VORowImpl object);

        public abstract void put(FuncApprovals_VORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int FUNCID = AttributesEnum.FuncId.index();
    public static final int ATTRGRPID = AttributesEnum.AttrGrpId.index();
    public static final int ACTIVEYN = AttributesEnum.ActiveYn.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int ROWID = AttributesEnum.RowID.index();
    public static final int TRANS_ACTIVE = AttributesEnum.Trans_Active.index();
    public static final int FUNCTIONS_ROVO1 = AttributesEnum.Functions_ROVO1.index();
    public static final int APPR_GROUP_NAME_ROVO1 = AttributesEnum.Appr_Group_Name_ROVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FuncApprovals_VORowImpl() {
    }

    /**
     * Gets FuncApprovals_EO entity object.
     * @return the FuncApprovals_EO
     */
    public EntityImpl getFuncApprovals_EO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for FUNC_ID using the alias name FuncId.
     * @return the FUNC_ID
     */
    public Number getFuncId() {
        return (Number) getAttributeInternal(FUNCID);
    }

    /**
     * Sets <code>value</code> as attribute value for FUNC_ID using the alias name FuncId.
     * @param value value to set the FUNC_ID
     */
    public void setFuncId(Number value) {
        setAttributeInternal(FUNCID, value);
    }

    /**
     * Gets the attribute value for ATTR_GRP_ID using the alias name AttrGrpId.
     * @return the ATTR_GRP_ID
     */
    public Number getAttrGrpId() {
        return (Number) getAttributeInternal(ATTRGRPID);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTR_GRP_ID using the alias name AttrGrpId.
     * @param value value to set the ATTR_GRP_ID
     */
    public void setAttrGrpId(Number value) {
        setAttributeInternal(ATTRGRPID, value);
    }

    /**
     * Gets the attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @return the ACTIVE_YN
     */
    public String getActiveYn() {
        return (String) getAttributeInternal(ACTIVEYN);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @param value value to set the ACTIVE_YN
     */
    public void setActiveYn(String value) {
        setAttributeInternal(ACTIVEYN, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for ROWID using the alias name RowID.
     * @return the ROWID
     */
    public RowID getRowID() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**
     * Sets <code>value</code> as attribute value for ROWID using the alias name RowID.
     * @param value value to set the ROWID
     */
    public void setRowID(RowID value) {
        setAttributeInternal(ROWID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trans_Active.
     * @return the Trans_Active
     */
    public Boolean getTrans_Active() {
        Boolean flag = false;
        if (this.getActiveYn() != null && this.getActiveYn().equals("Y")) {
            flag = true;
        //             System.err.println("flag"  + flag);
        } else {
            flag = false;
        //             System.err.println("flag"  + flag);
        }
        return flag;
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_Active.
     * @param value value to set the  Trans_Active
     */
    public void setTrans_Active(Boolean value) {
        if (value) {
            setActiveYn("Y");
        } else {
            setActiveYn("N");
        }
        setAttributeInternal(TRANS_ACTIVE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Functions_ROVO1.
     */
    public RowSet getFunctions_ROVO1() {
        return (RowSet)getAttributeInternal(FUNCTIONS_ROVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Appr_Group_Name_ROVO1.
     */
    public RowSet getAppr_Group_Name_ROVO1() {
        return (RowSet)getAttributeInternal(APPR_GROUP_NAME_ROVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}