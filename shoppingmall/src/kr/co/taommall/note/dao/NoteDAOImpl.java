package kr.co.taommall.note.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.taommall.note.vo.Note;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class NoteDAOImpl implements NoteDAO {

	@Autowired
	private SqlSessionTemplate session;
	private String nameSpace = "kr.co.taommall.note.dao.";
	
	@Override
	public void insertNote(Note note) {
		session.insert(nameSpace+"insertNote",note);
	}

	@Override
	public void deleteNote(ArrayList<Integer> list) {
		session.delete(nameSpace+"deleteNote", list);
	}

	@Override
	public void deleteSendNote(Model model) {
		session.delete(nameSpace+"deleteSendNote", model);
		
	}

	@Override
	public void deleteReceiveNote(Model model) {
		session.delete(nameSpace+"deleteReceiveNote", model);
		
	}

	@Override
	public void updateNoteStore(ArrayList<Integer> list) {
		session.update(nameSpace+"updateNoteStore",list);
	}
	
	@Override
	public void updateNoteRead(int noteNo){
		session.update(nameSpace+"updateNoteRead",noteNo);
	}

	@Override
	public List<Note> selectReceiveNote(Model model) {
		return session.selectList(nameSpace+"selectReceiveNote",model);
	}

	@Override
	public List<Note> selectSendNote(Model model) {
		return session.selectList(nameSpace+"selectSendNote",model);
	}

	@Override
	public List<Note> selectStoreNote(Model model) {
		return session.selectList(nameSpace+"selectStoreNote",model);
	}	
	
	@Override
	public List<Note> selectStoreRNote(Model model) {
		return session.selectList(nameSpace+"selectStoreRNote",model);
	}

	@Override
	public int selectNoteCountReceive(String receiveId) {
		return session.selectOne(nameSpace+"selectNoteCountReceive",receiveId);
	}

	@Override
	public int selectNoteCountSend(String sendId) {
		return session.selectOne(nameSpace+"selectNoteCountSend",sendId);
	}

	@Override
	public int selectNoteCountStore(String receiveId) {
		return session.selectOne(nameSpace+"selectNoteCountStore",receiveId);
	}

	@Override
	public int selectRNoteCountStore(String receiveId) {
		return session.selectOne(nameSpace+"selectRNoteCountStore",receiveId);
	}
	@Override
	public Note selectNoteByNo(int noteNo){
		return session.selectOne(nameSpace+"selectNoteByNo",noteNo);
	}

	@Override
	public int selectNoteCountReceiveNoRead(String receiveId) {
		return session.selectOne(nameSpace+"selectNoteCountReceiveNoRead",receiveId);
	}


	@Override
	public void deleteRNote(ArrayList<Integer> list) {
		session.delete(nameSpace+"deleteRNote", list);
	}

	@Override
	public void updateRNoteStore(ArrayList<Integer> list) {
		session.update(nameSpace+"updateRNoteStore",list);
		
	}

	@Override
	public void updateRNoteRead(int noteNo) {
		session.update(nameSpace+"updateRNoteRead",noteNo);
		
	}

	@Override
	public Note selectRNoteByNo(int noteNo) {
		return session.selectOne(nameSpace+"selectRNoteByNo",noteNo);
	}


	
	
}
