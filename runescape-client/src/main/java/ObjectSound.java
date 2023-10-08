import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1117438813
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1017683267
	)
	@Export("x")
	int x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1824721511
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1330219904
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1269826265
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 17843065
	)
	int field853;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -976838243
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1835023265
	)
	int field860;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1270416119
	)
	int field862;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 109274549
	)
	int field864;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field853 = var2.int7 * 128;
			this.field860 = var2.int5;
			this.field862 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field853 = 0;
			this.field860 = 0;
			this.field862 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class140.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "5"
	)
	static int method1955(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	static boolean method1952() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
