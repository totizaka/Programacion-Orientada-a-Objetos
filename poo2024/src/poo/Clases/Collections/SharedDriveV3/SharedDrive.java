package poo.Clases.Collections.SharedDriveV3;

import java.util.*;

public class SharedDrive{
    private final SequencedSet<SharedFile> sharedFiles = new TreeSet<>();
    public SharedDrive addFile(String fileName, String workArea){
        sharedFiles.add(new SharedFile(fileName, workArea));
        return this;
    }
    public SequencedSet<SharedFile> getAllFiles(){
        return sharedFiles;
    }
    public SequencedSet<SharedFile> getAllFilesReversed(){
        return sharedFiles.reversed();
    }
    public static class SharedFile implements Comparable<SharedFile>{
        private final String fileName, workArea;
        public SharedFile(String fileName, String workArea){
            this.fileName=fileName;
            this.workArea=workArea;
        }
        @Override
        public String toString(){
            return "File %s in work area %s".formatted(fileName, workArea);
        }
        @Override
        public int compareTo(SharedFile o){
            int cmp = fileName.compareTo(o.fileName);
            if (cmp==0){
                return workArea.compareTo(o.workArea);
            }
            return cmp;
        }
    }
}
