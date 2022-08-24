import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("du")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 929025169)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;

	@ObfuscatedName("gz")
	static String field1371;

	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lnt;Lnt;I)I", garbageValue = "-599692385")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}
		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(ILqr;I)Lfx;", garbageValue = "1791266795")
	public static PlayerCompositionColorTextureOverride method2551(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		PlayerCompositionColorTextureOverride var5 = new PlayerCompositionColorTextureOverride(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{ var6 & 15, var6 >> 4 & 15 };
			var8 = var5.playerCompositionRecolorTo != null && var7.length == var5.playerCompositionRecolorTo.length;
			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = ((short) (var1.readUnsignedShort()));
					if (var8) {
						var5.playerCompositionRecolorTo[var7[var9]] = var10;
					}
				}
			}
		}
		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{ var6 & 15, var6 >> 4 & 15 };
			var8 = var5.playerCompositionRetextureTo != null && var7.length == var5.playerCompositionRetextureTo.length;
			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = ((short) (var1.readUnsignedShort()));
					if (var8) {
						var5.playerCompositionRetextureTo[var7[var9]] = var10;
					}
				}
			}
		}
		return var5;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "370922234")
	static final void method2552(String var0) {
		class4.method20("Please remove " + var0 + " from your friend list first");
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "1829428973")
	static int method2553(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var5)))));
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var3.method5562()) ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			return class154.method3103(var3);
		} else if (var0 == 2709) {
			var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			return AttackOption.method2360(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-607876153")
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class116.method2678();
		class12.scene.clear();
		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}
		System.gc();
		class273.musicPlayerStatus = 1;
		NetFileRequest.musicTrackArchive = null;
		UrlRequester.musicTrackGroupId = -1;
		SceneTilePaint.musicTrackFileId = -1;
		class28.musicTrackVolume = 0;
		class273.musicTrackBoolean = false;
		class160.pcmSampleLength = 2;
		Client.currentTrackGroupId = -1;
		Client.playingJingle = false;
		class83.method2085();
		class4.updateGameState(10);
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1059665614")
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "653733105")
	static final void method2554(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3046()) {
				ClanChannelMember var2 = ((ClanChannelMember) (Client.currentClanChannels[var0].members.get(var1)));
				if (var2.rank == -1) {
					PacketBufferNode var3 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2947, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}