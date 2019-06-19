package Navarro.folder;

import java.io.File;
import java.util.Objects;

/**
 *
 * @author tetzu
 */
public class MiNodo extends DefaultMutableTreeNode{
    
    private File file;

    public MiNodo(File file) {
        this.file = file;
        
        public MiNodo(File file,Object o, boolean bin);

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "MiNodo{" + "file=" + file + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.file);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiNodo other = (MiNodo) obj;
        if (!Objects.equals(this.file, other.file)) {
            return false;
        }
        return true;
    }
        
        
    }
    
    
}