package data.repositories;

import data.models.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImplementation implements EntryRepository{
    private List<Entry> entries = new ArrayList<>();
    int count;
    @Override
    public Entry save(Entry entry) {
        if (isNew(entry)) {
            count++;
            entry.setId(generateNewId());
            entries.add(entry);
        } else update(Entry);
        return entry;
    }
    private void update(Entry updatentry){
        Entry oldEntry = findById(updatentry.getId());

    }

    private boolean isNew(boolean entry) {
        return entry;
    }

    private int generateNewId() {
        return count;
    }

    @Override
    public List<Entry> findAll() {
        return entries;
    }

    @Override
    public Entry findById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) return entry;
        }
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
        return count;
    }

    @Override
    public void clear() {

    }
}
