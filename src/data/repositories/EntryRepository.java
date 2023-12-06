package data.repositories;
import data.models.Entry;

import java.util.List;

public interface EntryRepository {
    Entry save(Entry enrty);
    List<Entry> findAll();
    Entry findById (int id);

    Entry findEntryIdAndDiaryId(int entryId, int diaryId);
    void delete (int id);
    void delete (Entry entry);
     long count();
    void clear();


}
