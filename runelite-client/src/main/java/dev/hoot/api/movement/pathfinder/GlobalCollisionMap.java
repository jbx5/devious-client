package dev.hoot.api.movement.pathfinder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

public class GlobalCollisionMap implements CollisionMap {
	public final BitSet4D[] regions = new BitSet4D[256 * 256];

	public GlobalCollisionMap() {
	}

	public GlobalCollisionMap(byte[] data) {
		var buffer = ByteBuffer.wrap(data);

		while (buffer.hasRemaining()) {
			var region = buffer.getShort() & 0xffff;
			regions[region] = new BitSet4D(buffer, 64, 64, 4, 2);
		}
	}

	public File writeToFile() {
		byte[] bytes = toBytes();
		File fileLoc = new File("collision-map");
		if (!fileLoc.isFile()) {
			try {
				fileLoc.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (ByteArrayOutputStream bos = new ByteArrayOutputStream(bytes.length);
				 GZIPOutputStream gos = new GZIPOutputStream(bos);
				 FileOutputStream fos = new FileOutputStream(fileLoc)) {
			gos.write(bytes);
			gos.finish();
			fos.write(bos.toByteArray());
			gos.flush();
			fos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileLoc;
	}

	public byte[] toBytes() {
		var regionCount = (int) Arrays.stream(regions).filter(Objects::nonNull).count();
		var buffer = ByteBuffer.allocate(regionCount * (2 + 64 * 64 * 4 * 2 / 8));

		for (var i = 0; i < regions.length; i++) {
			if (regions[i] != null) {
				buffer.putShort((short) i);
				regions[i].write(buffer);
			}
		}

		return buffer.array();
	}

	public void set(int x, int y, int z, int w, boolean value) {
		var region = regions[x / 64 * 256 + y / 64];

		if (region == null) {
			return;
		}

		region.set(x % 64, y % 64, z, w, value);
	}

	public BitSet4D getRegion(int x, int y) {
		int regionId = x / 64 * 256 + y / 64;
		return regions[regionId];
	}

	public void createRegion(int region) {
		regions[region] = new BitSet4D(64, 64, 4, 2);
		regions[region].setAll(true);
	}

	public boolean get(int x, int y, int z, int w) {
		var region = getRegion(x, y);

		if (region == null) {
			return true;
		}

		int regionX = x % 64;
		int regionY = y % 64;

		return region.get(regionX, regionY, z, w);
	}

	public void overwrite(GlobalCollisionMap globalCollisionMap) {
		System.arraycopy(globalCollisionMap.regions, 0, regions, 0, regions.length);
	}

	@Override
	public boolean n(int x, int y, int z) {
		return get(x, y, z, 0);
	}

	@Override
	public boolean e(int x, int y, int z) {
		return get(x, y, z, 1);
	}
}

