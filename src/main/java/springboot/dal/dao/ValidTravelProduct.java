package springboot.dal.dao;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "valid_travel_product")
public class ValidTravelProduct implements Serializable {


    @EmbeddedId
    private Id id;
    @Column(name = "view_logon_cd")
    private String viewLogonCd;
    @Column(name = "principal_cd")
    private String principalCd;
    @Column(name = "diary_cycle_cd")
    private String diaryCycleCd;
    @Column(name = "inactive_date")
    private Date inactiveDate;
    @Column(name = "inactive_ind")
    private String inactiveInd;
    @Column(name = "ticket_reqd_ind")
    private String ticketReqdInd;
    @Column(name = "own_label_brand")
    private String ownLabelBrand;
    @Column(name = "atol_num")
    private String atolNum;
    @Column(name = "sales_mix_grp_cd")
    private String salesMixGrpCd;
    @Column(name = "canx_letter_req_ind")
    private String canxLetterReqInd;
    @Column(name = "ticket_mode")
    private String ticketMode;
    @Column(name = "arrangement_fee_ind")
    private String arrangementFeeInd;


    public Operator getOperator() {
        return operator;
    }

    @ManyToOne
    @JoinColumn(name = "operator_cd", nullable = false)

//    @JoinTable(
//            name="operator")
//    @JoinColumn( name="operator_cd", insertable=false, updatable=false)
//    @JsonBackReference


    private Operator operator;


    public ValidTravelProduct() {
    }

    public ValidTravelProduct(String prodCd,String brochureCd, String viewLogonCd, String principalCd, String diaryCycleCd, Date inactiveDate, String inactiveInd, String ticketReqdInd, String ownLabelBrand, String atolNum, String salesMixGrpCd, String canxLetterReqInd, String ticketMode, String arrangementFeeInd

    ) {
        this.id = new Id(prodCd,brochureCd);
        this.viewLogonCd = viewLogonCd;
        this.principalCd = principalCd;
        this.diaryCycleCd = diaryCycleCd;
        this.inactiveDate = inactiveDate;
        this.inactiveInd = inactiveInd;
        this.ticketReqdInd = ticketReqdInd;
        this.ownLabelBrand = ownLabelBrand;
        this.atolNum = atolNum;
        this.salesMixGrpCd = salesMixGrpCd;
        this.canxLetterReqInd = canxLetterReqInd;
        this.ticketMode = ticketMode;
        this.arrangementFeeInd = arrangementFeeInd;
    }


    public String getViewLogonCd() {
        return viewLogonCd;
    }

    public String getPrincipalCd() {
        return principalCd;
    }

    public String getDiaryCycleCd() {
        return diaryCycleCd;
    }

    public Date getInactiveDate() {
        return inactiveDate;
    }

    public String getInactiveInd() {
        return inactiveInd;
    }

    public String getTicketReqdInd() {
        return ticketReqdInd;
    }

    public String getOwnLabelBrand() {
        return ownLabelBrand;
    }

    public String getAtolNum() {
        return atolNum;
    }

    public String getSalesMixGrpCd() {
        return salesMixGrpCd;
    }

    public String getCanxLetterReqInd() {
        return canxLetterReqInd;
    }

    public String getTicketMode() {
        return ticketMode;
    }

    public String getArrangementFeeInd() {
        return arrangementFeeInd;
    }

    public Id getId() {
        return id;
    }

    @Embeddable
    public static class Id implements Serializable {
        @Column(name = "prod_cd")
        private String prodCd;
        @Column(name = "brochure_cd")
        private String brochureCd;

        public String getProdCd() {
            return prodCd;
        }

        public String getBrochureCd() {
            return brochureCd;
        }

        public Id() {
        }

        public Id(String prodCd, String brochureCd) {

            this.prodCd = prodCd;
            this.brochureCd = brochureCd;
        }
    }
}




