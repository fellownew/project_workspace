package kr.co.taommall.note.vo;

import java.io.Serializable;

public class Note implements Serializable{
	private int noteNo;
	private String title;
	private String content;
	private String sendId;
	private String receiveId;
	private String sendDate;
	private String read;
	private String store;
	
	public Note(){}

	public Note(int noteNo, String title, String content, String sendId,
			String receiveId, String sendDate, String read, String store) {
		super();
		this.noteNo = noteNo;
		this.title = title;
		this.content = content;
		this.sendId = sendId;
		this.receiveId = receiveId;
		this.sendDate = sendDate;
		this.read = read;
		this.store = store;
	}

	public int getNoteNo() {
		return noteNo;
	}

	public void setNoteNo(int noteNo) {
		this.noteNo = noteNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSendId() {
		return sendId;
	}

	public void setSendId(String sendId) {
		this.sendId = sendId;
	}

	public String getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}

	public String getSendDate() {
		return sendDate;
	}

	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}

	public String getRead() {
		return read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + noteNo;
		result = prime * result + ((read == null) ? 0 : read.hashCode());
		result = prime * result
				+ ((receiveId == null) ? 0 : receiveId.hashCode());
		result = prime * result
				+ ((sendDate == null) ? 0 : sendDate.hashCode());
		result = prime * result + ((sendId == null) ? 0 : sendId.hashCode());
		result = prime * result + ((store == null) ? 0 : store.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (noteNo != other.noteNo)
			return false;
		if (read == null) {
			if (other.read != null)
				return false;
		} else if (!read.equals(other.read))
			return false;
		if (receiveId == null) {
			if (other.receiveId != null)
				return false;
		} else if (!receiveId.equals(other.receiveId))
			return false;
		if (sendDate == null) {
			if (other.sendDate != null)
				return false;
		} else if (!sendDate.equals(other.sendDate))
			return false;
		if (sendId == null) {
			if (other.sendId != null)
				return false;
		} else if (!sendId.equals(other.sendId))
			return false;
		if (store == null) {
			if (other.store != null)
				return false;
		} else if (!store.equals(other.store))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Note [noteNo=" + noteNo + ", title=" + title + ", content="
				+ content + ", sendId=" + sendId + ", receiveId=" + receiveId
				+ ", sendDate=" + sendDate + ", read=" + read + ", store="
				+ store + "]";
	}

}
