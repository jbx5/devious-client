import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gh")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("at")
	public static short[][] field1776;
	@ObfuscatedName("aw")
	boolean field1772;
	@ObfuscatedName("ay")
	boolean field1779;
	@ObfuscatedName("ar")
	@Export("members")
	public List members;
	@ObfuscatedName("am")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -3436089935081817211L
	)
	long field1773;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	public byte field1778;
	@ObfuscatedName("az")
	public byte field1780;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1779 = true;
		this.name = null;
		this.method3366(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "612198158"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method9741();
			}

			int[] var3 = this.sortedMembers;
			Actor.method2413(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfv;I)V",
		garbageValue = "-1094917033"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1130527405"
	)
	public int method3383() {
		return this.members.size();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1760330664"
	)
	public int method3370(String var1) {
		if (!this.field1779) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-404696620"
	)
	void method3366(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1772 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1779 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1773 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1780 = var1.readByte();
		this.field1778 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1772) {
					var1.readLong();
				}

				if (this.field1779) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-1273732472"
	)
	public static int method3380(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1607234368"
	)
	static int method3381(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6459() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return class74.method2089(var3);
		} else if (var0 == 2709) {
			var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return class133.method3040(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1686824610"
	)
	static int method3388() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field814;
		} else {
			return 10000;
		}
	}
}
