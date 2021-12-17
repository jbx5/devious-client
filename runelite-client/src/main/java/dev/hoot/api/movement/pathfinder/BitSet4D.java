package dev.hoot.api.movement.pathfinder;

import java.nio.ByteBuffer;
import java.util.BitSet;

public class BitSet4D {
    private final int sizeX;
    private final int sizeY;
    private final int sizeZ;
    private final int sizeW;
    private final BitSet bits;

    public BitSet4D(int sizeX, int sizeY, int sizeZ, int sizeW) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        this.sizeW = sizeW;
        bits = new BitSet(sizeX * sizeY * sizeZ * sizeW);
    }

    public BitSet4D(ByteBuffer buffer, int sizeX, int sizeY, int sizeZ, int sizeW) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        this.sizeW = sizeW;

        int bufferSize = buffer.limit();
        int regionSize = buffer.position() + (sizeX * sizeY * sizeZ * sizeW + 7) / 8;

        buffer.limit(regionSize);
        bits = BitSet.valueOf(buffer);

        buffer.position(buffer.limit());
        buffer.limit(bufferSize);
    }

    public void write(ByteBuffer buffer) {
        var startPos = buffer.position();
        buffer.put(bits.toByteArray());
        buffer.position(startPos + (sizeX * sizeY * sizeZ * sizeW + 7) / 8);
    }

    public boolean get(int index) {
        return bits.get(index);
    }

    public boolean get(int x, int y, int z, int w) {
        return bits.get(getIndex(x, y, z, w));
    }

    public void set(int x, int y, int z, int flag, boolean value) {
        bits.set(getIndex(x, y, z, flag), value);
    }

    public void setAll(boolean value) {
        bits.set(0, bits.size(), value);
    }

    public int getIndex(int x, int y, int z, int w) {
        if (x < 0 || y < 0 || z < 0 || w < 0 || x >= sizeX || y >= sizeY || z >= sizeZ || w >= sizeW) {
            throw new IndexOutOfBoundsException("(" + x + ", " + y + ", " + z + ", " + w + ")");
        }

        var index = z;
        index = index * sizeY + y;
        index = index * sizeX + x;
        index = index * sizeW + w;

        return index;
    }
}
