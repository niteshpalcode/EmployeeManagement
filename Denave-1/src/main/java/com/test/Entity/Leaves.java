package com.test.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Leaves {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "leave_id")
	    private Integer leaveId;
	    
	    @Column(name = "leave_type")
	    private String leaveType;
	    
//	    @Column(name = "from_date_time")
	    private LocalDateTime fromDate;
	    
//	    @Column(name = "to_date_time")
	    private LocalDateTime toDate;
	    
	    @Column(name = "day")
	    private String day;
	    
	    @Enumerated(EnumType.STRING)
	    private LeaveStatus leaveStatus;

	    
	    @ManyToOne(cascade = CascadeType.ALL)
	    private Employee employee;

	    public enum LeaveStatus {
	        PENDING,
	        APPROVED,
	        REJECTED
	    }

		public Leaves() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Leaves(Integer leaveId, String leaveType, LocalDateTime fromDate, LocalDateTime toDate, String day,
				LeaveStatus leaveStatus, Employee employee) {
			super();
			this.leaveId = leaveId;
			this.leaveType = leaveType;
			this.fromDate = fromDate;
			this.toDate = toDate;
			this.day = day;
			this.leaveStatus = leaveStatus;
			this.employee = employee;
		}

		public Integer getLeaveId() {
			return leaveId;
		}

		public void setLeaveId(Integer leaveId) {
			this.leaveId = leaveId;
		}

		public String getLeaveType() {
			return leaveType;
		}

		public void setLeaveType(String leaveType) {
			this.leaveType = leaveType;
		}

		public LocalDateTime getFromDate() {
			return fromDate;
		}

		public void setFromDate(LocalDateTime fromDate) {
			this.fromDate = fromDate;
		}

		public LocalDateTime getToDate() {
			return toDate;
		}

		public void setToDate(LocalDateTime toDate) {
			this.toDate = toDate;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public LeaveStatus getLeaveStatus() {
			return leaveStatus;
		}

		public void setLeaveStatus(LeaveStatus leaveStatus) {
			this.leaveStatus = leaveStatus;
		}

		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}


		
	
	    
	    

}
