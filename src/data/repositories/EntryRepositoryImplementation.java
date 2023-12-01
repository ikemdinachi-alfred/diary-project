package data.repositories;

import data.models.Entry;

import java.util.List;

public class EntryRepositoryImplementation implements EntryRepository{
    @Override
    public Entry save(Entry enrty) {
        return null;
    }

    @Override
    public List<Entry> findAll() {
        return null;
    }

    @Override
    public Entry findById(int id) {
        return null;
    }

    @Override
    public Entry findEntryIdAndDiaryId(int entryId, int diaryId) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(Entry entry) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void clear() {

    }
}
