import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ai")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("hc")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(intValue = 
	1381253271)

	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("i")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("f")
	@Export("map")
	Map map;
	@ObfuscatedName("b")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("n")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("s")
	@ObfuscatedGetter(longValue = 
	9211291169100794773L)

	long field1296;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class10.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = TriBool.method6839(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class10.archive2.method5824(15)) {
			var2 = class10.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1258010190")

	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IS)I", garbageValue = 
	"-20847")

	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? ((Integer) (var2)) : -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;I)V", garbageValue = 
	"1112436939")

	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"-1225749706")

	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? ((String) (var2)) : "";
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;I)V", garbageValue = 
	"-974893641")

	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"852602780")

	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"41")

	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(ZI)Lph;", garbageValue = 
	"291389659")

	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return ModeWhere.getPreferencesFile("2", Messages.field1305.name, var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-729376145")

	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = ((Entry) (var4.next()));
				int var6 = ((Integer) (var5.getKey()));
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class425.stringCp1252NullTerminatedByteSize(((String) (var7)));
					}

					++var3;
				}
			} 

			Buffer var27 = new Buffer(var2);
			var27.writeByte(2);
			var27.writeShort(var3);
			Iterator var28 = this.map.entrySet().iterator();

			label147 : while (
			true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset);
						break label147;
					}

					var16 = ((Entry) (var28.next()));
					var17 = ((Integer) (var16.getKey()));
				} while (!this.intsPersistence[var17] );

				var27.writeShort(var17);
				Object var8 = var16.getValue();
				Class var10 = var8.getClass();
				class431[] var11 = class431.method7584();
				int var12 = 0;

				class431 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null;
						break;
					}

					class431 var13 = var11[var12];
					if (var10 == var13.field4593) {
						var9 = var13;
						break;
					}

					++var12;
				} 

				var27.writeByte(var9.field4596);
				class431.method7579(var8, var27);
			} 
		} catch (Exception var25) {
		} finally {
			try {
				var1.close();
			} catch (Exception var24) {
			}

		}

		this.unwrittenChanges = false;
		this.field1296 = class136.method2931();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1780086074")

	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label226 : {
			try {
				byte[] var2 = new byte[((int) (var1.length()))];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == (-1)) {
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2);
				if ((var14.array.length - var14.offset) >= 1) {
					int var15 = var14.readUnsignedByte();
					if ((var15 >= 0) && (var15 <= 2)) {
						int var7;
						int var8;
						int var9;
						int var16;
						if (var15 >= 2) {
							var16 = var14.readUnsignedShort();
							var7 = 0;

							while (true) {
								if (var7 >= var16) {
									break label226;
								}

								var8 = var14.readUnsignedShort();
								var9 = var14.readUnsignedByte();
								class431 var10 = ((class431) (MusicPatchPcmStream.findEnumerated(class431.method7584(), var9)));
								Object var11 = var10.method7581(var14);
								if (this.intsPersistence[var8]) {
									this.map.put(var8, var11);
								}

								++var7;
							} 
						} else {
							var16 = var14.readUnsignedShort();

							for (var7 = 0; var7 < var16; ++var7) {
								var8 = var14.readUnsignedShort();
								var9 = var14.readInt();
								if (this.intsPersistence[var8]) {
									this.map.put(var8, var9);
								}
							}

							var7 = var14.readUnsignedShort();
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label226;
								}

								var14.readUnsignedShort();
								var14.readStringCp1252NullTerminated();
								++var8;
							} 
						}
					}

					return;
				}
			} catch (Exception var25) {
				break label226;
			} finally {
				try {
					var1.close();
				} catch (Exception var24) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2021693946")

	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && (this.field1296 < (class136.method2931() - 60000L))) {
			this.write();
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-23")

	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1953067165")

	static void method2463() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			if ((var1[var2] != Client.combatTargetPlayerIndex) && (var1[var2] != Client.localPlayerIndex)) {
				ArchiveLoader.addPlayerToScene(Client.players[var1[var2]], true);
			}
		}

	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"7")

	static boolean method2441() {
		return (Client.drawPlayerNames & 1) != 0;
	}
}