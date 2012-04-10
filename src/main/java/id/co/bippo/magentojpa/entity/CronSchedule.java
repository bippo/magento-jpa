package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the cron_schedule database table.
 * 
 */
@Entity
@Table(name="cron_schedule")
public class CronSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="schedule_id")
	private int scheduleId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="executed_at")
	private Timestamp executedAt;

	@Column(name="finished_at")
	private Timestamp finishedAt;

	@Column(name="job_code")
	private String jobCode;

    @Lob()
	private String messages;

	@Column(name="scheduled_at")
	private Timestamp scheduledAt;

	private String status;

    public CronSchedule() {
    }

	public int getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getExecutedAt() {
		return this.executedAt;
	}

	public void setExecutedAt(Timestamp executedAt) {
		this.executedAt = executedAt;
	}

	public Timestamp getFinishedAt() {
		return this.finishedAt;
	}

	public void setFinishedAt(Timestamp finishedAt) {
		this.finishedAt = finishedAt;
	}

	public String getJobCode() {
		return this.jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getMessages() {
		return this.messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public Timestamp getScheduledAt() {
		return this.scheduledAt;
	}

	public void setScheduledAt(Timestamp scheduledAt) {
		this.scheduledAt = scheduledAt;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}