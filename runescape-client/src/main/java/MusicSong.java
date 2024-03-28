import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ml")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		intValue = -391930707
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2141247955
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -114208929
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1472570331
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("an")
	public float field3608;
	@ObfuscatedName("ao")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ab")
	public boolean field3610;
	@ObfuscatedName("aw")
	public boolean field3617;
	@ObfuscatedName("ad")
	public boolean field3604;
	@ObfuscatedName("al")
	boolean field3612;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	public SoundCache field3615;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public MusicTrack field3616;

	@ObfuscatedSignature(
		descriptor = "(Loc;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3608 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3604 = false;
		this.field3612 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6239(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Loc;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3608 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3604 = false;
		this.field3612 = false;
		this.method6239(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;IIIZB)V",
		garbageValue = "3"
	)
	void method6239(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2138717915"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1606535135"
	)
	static int method6238(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class342.Widget_unpackTargetMask(class33.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "1334168126"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
