package data.repositories;

import data.models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntryRepositoryImplementationTest {
    private  EntryRepositoryImplementation entryRepository;
    @BeforeEach
    public void startAllTestsWith(){
        entryRepository = new EntryRepositoryImplementation();
    }
    @Test
    public void savedOneEntry_countIsOneTest(){
        Entry entry = new Entry();
        entryRepository.save(entry);
        assertEquals(1,entryRepository.count());
    }
    @Test
    public void savedTwoEntry_countIsOneTest(){
        Entry entry = new Entry();
        entryRepository.save(entry);
        assertEquals(2,entryRepository.count());
    }
    @Test
    public void savedOneEntry_FindAllCountReturnTwoTest(){
        Entry entry = new Entry();
        entryRepository.save(entry);
        assertEquals(2,entryRepository.findAll().size());
    }
    @Test
    public void savedNewEntry_iDIsOneTest(){
        Entry entry = new Entry();
        assertEquals(0,entry.getId());
        entryRepository.save(entry);
        assertEquals(1,entry.getId());
    }
    @Test
    public void savedUpdatedEntry_DoesNotInfluenceCountOneTest(){
        Entry entry = new Entry();
        entryRepository.save(entry);
        Entry updatedEntery = new Entry();
        updatedEntery.setId(1);
        entryRepository.save(updatedEntery);
        assertEquals(1,entryRepository.count());
       assertEquals(updatedEntery,entryRepository);
    }

}