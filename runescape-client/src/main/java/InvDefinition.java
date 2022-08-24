import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("fz")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("b")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1732860883)
	@Export("size")
	public int size = 0;

	InvDefinition() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "-13")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "-2049496146")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "1386568227")
	static int method3279(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return BoundaryObject.method4420(var0, var1, var2);
		} else if (var0 < 1100) {
			return Coord.method5485(var0, var1, var2);
		} else if (var0 < 1200) {
			return GrandExchangeOfferOwnWorldComparator.method1081(var0, var1, var2);
		} else if (var0 < 1300) {
			return class14.method170(var0, var1, var2);
		} else if (var0 < 1400) {
			return class142.method2982(var0, var1, var2);
		} else if (var0 < 1500) {
			return MouseRecorder.method2072(var0, var1, var2);
		} else if (var0 < 1600) {
			return ClanChannelMember.method2819(var0, var1, var2);
		} else if (var0 < 1700) {
			return GrandExchangeEvent.method5931(var0, var1, var2);
		} else if (var0 < 1800) {
			return WorldMapLabelSize.method4451(var0, var1, var2);
		} else if (var0 < 1900) {
			return SecureRandomFuture.method1932(var0, var1, var2);
		} else if (var0 < 2000) {
			return method3277(var0, var1, var2);
		} else if (var0 < 2100) {
			return Coord.method5485(var0, var1, var2);
		} else if (var0 < 2200) {
			return GrandExchangeOfferOwnWorldComparator.method1081(var0, var1, var2);
		} else if (var0 < 2300) {
			return class14.method170(var0, var1, var2);
		} else if (var0 < 2400) {
			return class142.method2982(var0, var1, var2);
		} else if (var0 < 2500) {
			return MouseRecorder.method2072(var0, var1, var2);
		} else if (var0 < 2600) {
			return class165.method3253(var0, var1, var2);
		} else if (var0 < 2700) {
			return ChatChannel.method1964(var0, var1, var2);
		} else if (var0 < 2800) {
			return UserComparator8.method2553(var0, var1, var2);
		} else if (var0 < 2900) {
			return class14.method179(var0, var1, var2);
		} else if (var0 < 3000) {
			return method3277(var0, var1, var2);
		} else if (var0 < 3200) {
			return class142.method2989(var0, var1, var2);
		} else if (var0 < 3300) {
			return class136.method2878(var0, var1, var2);
		} else if (var0 < 3400) {
			return class296.method5654(var0, var1, var2);
		} else if (var0 < 3500) {
			return class124.method2768(var0, var1, var2);
		} else if (var0 < 3600) {
			return class321.method5912(var0, var1, var2);
		} else if (var0 < 3700) {
			return class67.method1862(var0, var1, var2);
		} else if (var0 < 3800) {
			return class21.method294(var0, var1, var2);
		} else if (var0 < 3900) {
			return class135.method2870(var0, var1, var2);
		} else if (var0 < 4000) {
			return DbTableType.method7535(var0, var1, var2);
		} else if (var0 < 4100) {
			return class93.method2345(var0, var1, var2);
		} else if (var0 < 4200) {
			return SoundCache.method744(var0, var1, var2);
		} else if (var0 < 4300) {
			return DefaultsGroup.method6838(var0, var1, var2);
		} else if (var0 < 5100) {
			return Login.method1879(var0, var1, var2);
		} else if (var0 < 5400) {
			return PlayerCompositionColorTextureOverride.method3266(var0, var1, var2);
		} else if (var0 < 5600) {
			return WorldMapSection0.method4868(var0, var1, var2);
		} else if (var0 < 5700) {
			return Script.method1947(var0, var1, var2);
		} else if (var0 < 6300) {
			return class267.method5148(var0, var1, var2);
		} else if (var0 < 6600) {
			return SecureRandomCallable.method2026(var0, var1, var2);
		} else if (var0 < 6700) {
			return class11.method104(var0, var1, var2);
		} else if (var0 < 6800) {
			return class101.method2514(var0, var1, var2);
		} else if (var0 < 6900) {
			return MouseHandler.method569(var0, var1, var2);
		} else if (var0 < 7000) {
			return class138.method2896(var0, var1, var2);
		} else if (var0 < 7100) {
			return ArchiveDisk.method6836(var0, var1, var2);
		} else if (var0 < 7200) {
			return Strings.method5685(var0, var1, var2);
		} else if (var0 < 7300) {
			return UserComparator3.method2575(var0, var1, var2);
		} else if (var0 < 7500) {
			return KitDefinition.method3336(var0, var1, var2);
		} else if (var0 < 7600) {
			return VarbitComposition.method3502(var0, var1, var2);
		} else {
			return var0 < 7700 ? class83.method2079(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-1121646092")
	static int method3277(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = (var2) ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field831.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				User.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class93 var6 = new class93(var5, var3, var4, HitSplatDefinition.getWidget(var3).itemId);
					Interpreter.field831.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field830 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
			} else {
				var7 = (var2) ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
			}
			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1039 = Interpreter.field830 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(ILkn;IIIII[FS)Lkn;", garbageValue = "167")
	static Widget method3278(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = ((int) (var7[0] * ((float) (var1.width))));
		var8.rawY = ((int) (var7[1] * ((float) (var1.height))));
		var8.rawWidth = ((int) (var7[2] * ((float) (var1.width))));
		var8.rawHeight = ((int) (var7[3] * ((float) (var1.height))));
		return var8;
	}

	@ObfuscatedName("em")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2056881446")
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			VarcInt.method3328();
		} else if (var0 != -1 && var0 != Client.currentTrackGroupId && ClanMate.clientPreferences.method2222() != 0 && !Client.playingJingle) {
			Archive var1 = PacketBuffer.archive6;
			int var2 = ClanMate.clientPreferences.method2222();
			class273.musicPlayerStatus = 1;
			NetFileRequest.musicTrackArchive = var1;
			UrlRequester.musicTrackGroupId = var0;
			SceneTilePaint.musicTrackFileId = 0;
			class28.musicTrackVolume = var2;
			class273.musicTrackBoolean = false;
			class160.pcmSampleLength = 2;
		}
		Client.currentTrackGroupId = var0;
	}
}