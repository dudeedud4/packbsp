/*
 * 
 */
package com.technofovea.packbsp.devkits;

import com.technofovea.hl2parse.vdf.GameConfigReader;
import com.technofovea.hl2parse.vdf.GameInfoReader;
import java.io.File;
import java.util.List;

/**
 *
 * @author Darien Hager
 */
class DefaultGameImpl implements Game {

    final GameEngine parent;
    private final GameConfigReader.Game data;
    private final File infoFile;

    public DefaultGameImpl(GameEngine parent, GameConfigReader.Game data) {
        this.data = data;
        this.parent = parent;
        infoFile = new File(data.getGameDir(), GameInfoReader.DEFAULT_FILENAME);
    }

    public GameEngine getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return data.getName();
    }

    public boolean isPresent() {
        return infoFile.isFile();
    }

    public File getBspDir() {
        return data.getBspDir();
    }

    public File getVmfDir() {
        return data.getVmfDir();
    }

    public File getGameDir() {
        return data.getGameDir();
    }

    public List<File> getFgdFiles() {
        return data.getFgds();
    }

    public String getId() {
        //TODO double-check appropriate value
        return data.getName();
    }


}
