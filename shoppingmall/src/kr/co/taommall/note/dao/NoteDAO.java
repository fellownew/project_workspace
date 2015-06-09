package kr.co.taommall.note.dao;

import java.util.List;

import kr.co.taommall.note.vo.Note;

import org.springframework.ui.Model;

public interface NoteDAO {

	void insertNote(Note note);
	void deleteNote(int noteNo);
	void updateNoteStore(int noteNo);
	void updateNoteRead(int noteNo);
	List<Note> selectReceiveNote(Model model);
	List<Note> selectSendNote(Model model);
	List<Note> selectStoreNote(Model model);
	int selectNoteCountReceive(String receiveId);
	int selectNoteCountSend(String sendId);
	int selectNoteCountStore(String receiveId);
	Note selectNoteByNo(int noteNo);
	
}
