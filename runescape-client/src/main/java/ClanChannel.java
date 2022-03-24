import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;





import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("st")
	@ObfuscatedGetter(intValue = 
	227189983)

	static int field1660;
	@ObfuscatedName("um")
	@ObfuscatedSignature(descriptor = 
	"Lon;")

	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("c")
	static boolean field1673;
	@ObfuscatedName("v")
	boolean field1665;
	@ObfuscatedName("o")
	boolean field1662;
	@ObfuscatedName("h")
	@Export("members")
	public List members;
	@ObfuscatedName("g")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("l")
	@ObfuscatedGetter(longValue = 
	-3432068679445221973L)

	long field1664;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("d")
	public byte field1666;
	@ObfuscatedName("f")
	public byte field1669;
	static 
	{
		new BitSet(65536);
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpd;)V")

	public ClanChannel(Buffer var1) {
		this.field1662 = true;
		this.name = null;
		this.method3058(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[I", garbageValue = 
	"-400020002")

	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember) (this.members.get(var2))).username.method8362();
			}

			int[] var3 = this.sortedMembers;
			WorldMapData_0.method4518(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leu;I)V", garbageValue = 
	"1497910385")

	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-92")

	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(S)I", garbageValue = 
	"-15392")

	public int method3056() {
		return this.members.size();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)I", garbageValue = 
	"-327623603")

	public int method3057(String var1) {
		if (!this.field1662) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember) (this.members.get(var2))).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"1254848749")

	void method3058(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1665 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1662 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1664 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1669 = var1.readByte();
		this.field1666 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1665) {
					var1.readLong();
				}

				if (this.field1662) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2058786387")

	public static void method3068() {
		try {
			File var0 = new File(class230.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label37 : for (
				int var1 = 0; var1 < WorldMapSection1.cacheSubPaths.length; ++var1) {
					for (var2 = 0; var2 < PendingSpawn.cacheParentPaths.length; ++var2) {
						File var3 = new File(((PendingSpawn.cacheParentPaths[var2] + WorldMapSection1.cacheSubPaths[var1]) + File.separatorChar) + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label37;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-1846400390")

	static int method3078(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ReflectionCheck.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if ((var3 == 1) || (var3 == 2)) {
					UserComparator6.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Interpreter.clientPreferences.method2317();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class295.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					class295.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--class295.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					ChatChannel.Interpreter_stringStackSize -= 2;
					--class295.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--ChatChannel.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				if ((var3 == 1) || (var3 == 2)) {
					Interpreter.clientPreferences.method2276(var3);
				}

				return 1;
			}
		}
	}
}