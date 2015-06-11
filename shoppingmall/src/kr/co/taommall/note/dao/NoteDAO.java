package kr.co.taommall.note.dao;

import java.util.List;

import kr.co.taommall.note.vo.Note;

import org.springframework.ui.Model;

public interface NoteDAO {

	void insertNote(Note note);
	void deleteNote(int noteNo);
	void deleteRNote(int noteNo);
	void deleteSendNote(Model model);
	void deleteReceiveNote(Model model);
	void updateNoteStore(int noteNo);
	void updateRNoteStore(int noteNo);
	void updateNoteRead(int noteNo);
	void updateRNoteRead(int noteNo);
	Note selectNoteByNo(int noteNo);
	Note selectRNoteByNo(int noteNo);
	List<Note> selectReceiveNote(Model model);
	List<Note> selectSendNote(Model model);
	List<Note> selectStoreNote(Model model);
	List<Note> selectStoreRNote(Model model);
	int selectNoteCountReceive(String receiveId);
	int selectNoteCountSend(String sendId);
	int selectNoteCountStore(String receiveId);
	int selectRNoteCountStore(String receiveId);
	int selectNoteCountReceiveNoRead(String receiveId);
	
}
