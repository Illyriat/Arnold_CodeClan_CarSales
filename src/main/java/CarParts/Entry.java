package CarParts;

import CarParts.Types.EntryType;

public class Entry {

    private String entry;

    private EntryType entryType;

    public Entry(EntryType entry) {
        this.entryType = getEntry();
    }

    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }

    public EntryType getEntry() {
        return entryType;
    }

}
