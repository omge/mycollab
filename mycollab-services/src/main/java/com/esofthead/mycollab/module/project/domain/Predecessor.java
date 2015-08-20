/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_prj_predecessor*/
package com.esofthead.mycollab.module.project.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import com.esofthead.mycollab.core.db.metadata.Column;
import com.esofthead.mycollab.core.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_predecessor")
public class Predecessor extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_predecessor.id
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    @Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_predecessor.type
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_predecessor.typeId
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    @Column("typeId")
    private Integer typeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_predecessor.predestype
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("predestype")
    private String predestype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_predecessor.createdTime
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_predecessor.createdUser
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (obj.getClass() != getClass()) { return false;}
        Predecessor item = (Predecessor)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(785, 1031).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_predecessor.id
     *
     * @return the value of m_prj_predecessor.id
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_predecessor.id
     *
     * @param id the value for m_prj_predecessor.id
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_predecessor.type
     *
     * @return the value of m_prj_predecessor.type
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_predecessor.type
     *
     * @param type the value for m_prj_predecessor.type
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_predecessor.typeId
     *
     * @return the value of m_prj_predecessor.typeId
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_predecessor.typeId
     *
     * @param typeid the value for m_prj_predecessor.typeId
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_predecessor.predestype
     *
     * @return the value of m_prj_predecessor.predestype
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public String getPredestype() {
        return predestype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_predecessor.predestype
     *
     * @param predestype the value for m_prj_predecessor.predestype
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public void setPredestype(String predestype) {
        this.predestype = predestype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_predecessor.createdTime
     *
     * @return the value of m_prj_predecessor.createdTime
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_predecessor.createdTime
     *
     * @param createdtime the value for m_prj_predecessor.createdTime
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_predecessor.createdUser
     *
     * @return the value of m_prj_predecessor.createdUser
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_predecessor.createdUser
     *
     * @param createduser the value for m_prj_predecessor.createdUser
     *
     * @mbggenerated Wed Aug 19 10:48:10 ICT 2015
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    public enum Field {
        id,
        type,
        typeid,
        predestype,
        createdtime,
        createduser;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}