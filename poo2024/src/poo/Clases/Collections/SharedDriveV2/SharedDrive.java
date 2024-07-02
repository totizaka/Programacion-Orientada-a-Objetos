package poo.Clases.Collections.SharedDriveV2;

import java.util.*;
import java.util.function.Predicate;

public class SharedDrive {
    private final Set<SharedFile> SharedFiles= new HashSet<>();

    public SharedDrive addFile(String fileName, String workArea){
        SharedFile newSharedFile = new SharedFile(fileName, workArea);
        SharedFiles.add(newSharedFile);
        return this;
    }
    public int filesCount(Predicate<SharedFile> predicate){
        int count=0;
        for (SharedFile sharedFile : SharedFiles){
            if (predicate.test(sharedFile)){
                count++;
            }
        }
        return count;
    }
    public void renameFile(String fileName, String workArea, String newFileName){
        boolean removed = SharedFiles.remove(new SharedFile(fileName, workArea));
        if (removed){
            addFile(newFileName, workArea);
        }
        throw new IllegalArgumentException();
    }
    public boolean fileExists(String fileName, String workArea){
        return SharedFiles.contains(new SharedFile(fileName, workArea));
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
        @Override
        public boolean equals(Object o){
            return o instanceof SharedFile sharedFile &&
                    fileName.equals(sharedFile.fileName) &&
                    workArea.equals(sharedFile.workArea);
        }
        @Override
        public int hashCode(){
            return Objects.hash(fileName,workArea);
        }
    }
}
