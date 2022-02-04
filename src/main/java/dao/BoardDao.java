package dao;

import dao.generic.AbstractJpaDao;
import entities.Board;

import java.util.List;

public class BoardDao extends AbstractJpaDao<Long, Board> {

    public BoardDao() {
        super();
    }

    @Override
    public void setClass(Class<Board> _classToSet) {
        super.setClass(_classToSet);
    }

    @Override
    public Board findOne(Long id) {
        return super.findOne(id);
    }

    @Override
    public List<Board> findAll() {
        return super.findAll();
    }

    @Override
    public void save(Board entity) {
        super.save(entity);
    }

    @Override
    public Board update(Board entity) {
        return super.update(entity);
    }

    @Override
    public void delete(Board entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long entityId) {
        super.deleteById(entityId);
    }
}