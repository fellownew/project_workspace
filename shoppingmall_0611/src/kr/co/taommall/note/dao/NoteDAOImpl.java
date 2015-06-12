package kr.co.taommall.note.dao;

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
	public void deleteNote(int noteNo) {
		session.delete(nameSpace+"deleteNote", noteNo);
	}

	@Override
	public void updateNoteStore(int noteNo) {
		session.update(nameSpace+"updateNoteStore",noteNo);
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
	public Note selectNoteByNo(int noteNo){
		return session.selectOne(nameSpace+"selectNoteByNo",noteNo);
	}

	@Override
	public int selectNoteCountReceiveNoRead(String receiveId) {
		
		return session.selectOne(nameSpace+"selectNoteCountReceiveNoRead",receiveId);
	}
	
	
}