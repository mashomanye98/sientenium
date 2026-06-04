package com.sientenium.demo.model;

import java.time.LocalDate;

public class Loan {

    private Long loanId;
    private Long assetId;
    private Long userId;
    private LocalDate requestDate;
    private String status;
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public Loan() {
    }

    public Loan(Long loanId, Long assetId, Long userId, LocalDate requestDate, String status, LocalDate checkoutDate, LocalDate dueDate, LocalDate returnDate) {
        this.loanId = loanId;
        this.assetId = assetId;
        this.userId = userId;
        this.requestDate = requestDate;
        this.status = status;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
