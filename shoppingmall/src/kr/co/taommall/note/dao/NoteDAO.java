package kr.co.taommall.note.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.taommall.note.vo.Note;

import org.springframework.ui.Model;

public interface NoteDAO {

	void insertNote(Note note);
	void deleteNote(ArrayList<Integer> list);
	void deleteRNote(ArrayList<Integer> list);
	void deleteSendNote(Model model);
	void deleteReceiveNote(Model model);
	void updateNoteStore(ArrayList<Integer> list);
	void updateRNoteStore(ArrayList<Integer> list);
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
