import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import java.net.MalformedURLException;
import java.io.InputStream;
import net.runelite.mapping.Implements;
import java.net.URLConnection;
import java.net.URL;
import java.util.Random;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.HashSet;
import net.runelite.mapping.Export;
@ObfuscatedName("iu")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("z")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;

	@ObfuscatedName("r")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;

	@ObfuscatedName("u")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "(Lqt;Lqt;IZI)V", garbageValue = "-15216320")
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.worldMapData0Set = new HashSet(var5);
		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();
			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}
			this.worldMapData0Set.add(var7);
		}
		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);
		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();
			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}
			this.worldMapData1Set.add(var8);
		}
		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "(Lqt;ZI)V", garbageValue = "-681546343")
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();
		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0(((Coord) (null)), var6, var5, ((WorldMapLabel) (null))));
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)I", garbageValue = "-513053480")
	static final int method5082(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{ var3.nextInt(), var3.nextInt(), ((int) (var0 >> 32)), ((int) (var0)) };
		var4.writeByte(10);
		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}
		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}
		var4.encryptRsa(class65.field865, class65.field868);
		var5.writeByte(10);
		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}
		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		if (Client.randomDatData != null) {
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var20 = ModeWhere.method6082();
			var5.writeBytes(var20, 0, var20.length);
		}
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class65.field865, class65.field868);
		var7 = ScriptEvent.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}
		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var4.offset + var5.offset + var8.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		byte[] var11 = var9.array;
		int var13 = var11.length;
		StringBuilder var14 = new StringBuilder();
		int var17;
		for (int var15 = 0; var15 < var13 + 0; var15 += 3) {
			int var16 = var11[var15] & 255;
			var14.append(class341.field4146[var16 >>> 2]);
			if (var15 < var13 - 1) {
				var17 = var11[var15 + 1] & 255;
				var14.append(class341.field4146[(var16 & 3) << 4 | var17 >>> 4]);
				if (var15 < var13 - 2) {
					int var18 = var11[var15 + 2] & 255;
					var14.append(class341.field4146[(var17 & 15) << 2 | var18 >>> 6]).append(class341.field4146[var18 & 63]);
				} else {
					var14.append(class341.field4146[(var17 & 15) << 2]).append("=");
				}
			} else {
				var14.append(class341.field4146[(var16 & 3) << 4]).append("==");
			}
		}
		String var12 = var14.toString();
		var12 = var12;
		try {
			URL var21 = new URL(ModeWhere.method6080("services", false) + "m=accountappeal/login.ws");
			URLConnection var27 = var21.openConnection();
			var27.setDoInput(true);
			var27.setDoOutput(true);
			var27.setConnectTimeout(5000);
			OutputStreamWriter var22 = new OutputStreamWriter(var27.getOutputStream());
			var22.write("data2=" + GrandExchangeOfferOwnWorldComparator.method1097(var12) + "&dest=" + GrandExchangeOfferOwnWorldComparator.method1097("passwordchoice.ws"));
			var22.flush();
			InputStream var23 = var27.getInputStream();
			var9 = new Buffer(new byte[1000]);
			do {
				var17 = var23.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var17 == -1) {
					var22.close();
					var23.close();
					String var24 = new String(var9.array);
					if (var24.startsWith("OFFLINE")) {
						return 4;
					} else if (var24.startsWith("WRONG")) {
						return 7;
					} else if (var24.startsWith("RELOAD")) {
						return 3;
					} else if (var24.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);
						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						} 
						var24 = new String(var9.array, 0, var9.offset);
						boolean var28;
						if (var24 == null) {
							var28 = false;
						} else {
							label107 : {
								try {
									new URL(var24);
								} catch (MalformedURLException var25) {
									var28 = false;
									break label107;
								}
								var28 = true;
							}
						}
						if (var28) {
							class258.openURL(var24, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}
				var9.offset += var17;
			} while (var9.offset < 1000 );
			return 5;
		} catch (Throwable var26) {
			var26.printStackTrace();
			return 5;
		}
	}
}