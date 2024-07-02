package poo.Clases.Collections.SharedDriveV4;

import java.util.*;

public class SharedDrive {
    private SequencedMap<String, SequencedSet<SharedFile>> sharedFiles = new TreeMap<>();
    public SharedDrive addFile(String fileName, String workArea){
        if (!sharedFiles.containsKey(workArea)){
            sharedFiles.put(workArea, new TreeSet<>());
        }
        sharedFiles.get(workArea).add(new SharedFile(fileName, workArea));
        return this;
    }
    //Otra forma:
    //public SharedDrive addFile(String fileName, String workArea){
    //   sharedFiles.putIfAbsent(workArea, new TreeSet<>();
    //   sharedFiles.get(workArea).add(new SharedFile(fileName, workArea));
    //   return this;
    //    }

    public Set<SharedFile> getWorkAreaFiles(String workArea){
        return sharedFiles.getOrDefault(workArea, new TreeSet<>());
    }

    public Set<String> getWorkAreas(){
        return sharedFiles.reversed().keySet();
    }

    public int filesCount(String workArea){
        return getWorkAreaFiles(workArea).size();
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
