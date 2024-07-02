package poo.Clases.Collections.SharedDriveV1;

import java.util.ArrayList;
import java.util.SequencedCollection;
import java.util.function.Predicate;

public class SharedDrive{
    private final SequencedCollection<SharedFile> SharedFiles = new ArrayList<>();

    public SharedDrive addFile(String fileName, String workArea){
        SharedFile newSharedFile = new SharedFile(fileName, workArea);
        SharedFiles.add(newSharedFile);
        return this;
    }
    public SequencedCollection<SharedFile> getAllFiles(){
        return SharedFiles;
    }
    public SharedFile getFirstFile(Predicate<SharedFile> predicate){
        for (SharedFile sharedFile : SharedFiles){
            if (predicate.test(sharedFile)){
                return sharedFile;
            }
        }
        throw new IllegalArgumentException();
    }
    public SharedFile getLastFile(){
        return SharedFiles.getLast();
    }
    public static class SharedFile{
        private final String fileName, workArea;
        public SharedFile(String fileName, String workArea){
            this.fileName=fileName;
            this.workArea=workArea;
        }
        public String getFileName(){
            return fileName;
        }
        @Override
        public String toString() {
            return "File %s in work area %s".formatted(fileName, workArea);
        }
    }
}

