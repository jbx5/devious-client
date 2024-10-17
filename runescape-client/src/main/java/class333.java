import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class333 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field3624;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field3622;
	@ObfuscatedName("aj")
	public static ArrayList field3626;
	@ObfuscatedName("ai")
	public static LinkedList field3625;
	@ObfuscatedName("ay")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("as")
	public static ArrayList field3628;
	@ObfuscatedName("ae")
	static ArrayList field3623;
	@ObfuscatedName("am")
	public static final List field3627;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1912330687
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 402183881
	)
	static int field3631;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -399918875
	)
	static int field3632;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1503766987
	)
	static int field3633;
	@ObfuscatedName("ax")
	@Export("osName")
	static String osName;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 168118551
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("decimator")
	static Decimator decimator;

	static {
		field3626 = null;
		field3625 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3628 = new ArrayList(3);
		field3623 = new ArrayList();
		field3627 = new ArrayList();
		musicPlayerStatus = 0;
		field3631 = 0;
		field3632 = 0;
		field3633 = 0;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "31873403"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4599 != 0 && var3 > AbstractArchive.field4599) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4599 == 0 || var4 <= AbstractArchive.field4599)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}
}
