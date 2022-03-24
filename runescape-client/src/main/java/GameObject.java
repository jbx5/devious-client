import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("w")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-847164107)

	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-940265289)

	@Export("z")
	int z;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-198288323)

	@Export("centerX")
	int centerX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	240672507)

	@Export("centerY")
	int centerY;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lgh;")

	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1154324973)

	@Export("orientation")
	int orientation;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-2061335069)

	@Export("startX")
	int startX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1084984155)

	@Export("endX")
	int endX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-1316603005)

	@Export("startY")
	int startY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-609115179)

	@Export("endY")
	int endY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1379225673)

	int field2639;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	508066469)

	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 
	-5816453776814421193L)

	@Export("tag")
	public long tag;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-1479412759)

	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1885717447")

	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		MouseHandler.method593();
		FriendSystem.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		class273.musicPlayerStatus = 1;
		class147.musicTrackArchive = null;
		ArchiveLoader.musicTrackGroupId = -1;
		class273.musicTrackFileId = -1;
		DevicePcmPlayerProvider.musicTrackVolume = 0;
		class260.musicTrackBoolean = false;
		class273.pcmSampleLength = 2;
		Client.currentTrackGroupId = -1;
		Client.field731 = false;
		Players.method2419();
		InterfaceParent.updateGameState(10);
	}
}