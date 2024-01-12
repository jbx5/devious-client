import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qt")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	MusicSong field4592;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 790629697
	)
	int field4593;

	@ObfuscatedSignature(
		descriptor = "(Lqd;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4592 = null;
		this.field4593 = 0;
		super.field4597 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class319.field3461.size()) {
				this.field4592 = (MusicSong)class319.field3461.get(var2);
			} else if (!var3 && var2 < class319.musicSongs.size()) {
				this.field4592 = (MusicSong)class319.musicSongs.get(var2);
			}

			this.field4593 = var4;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (this.field4592 != null && this.field4592.midiPcmStream != null) {
			this.field4592.field3580 = true;

			try {
				if (this.field4592.field3576 < (float)this.field4592.musicTrackVolume && this.field4592.midiPcmStream.isReady()) {
					float var1 = this.field4593 == 0 ? (float)this.field4593 : (float)this.field4592.musicTrackVolume / (float)this.field4593;
					MusicSong var10000 = this.field4592;
					var10000.field3576 += 0.0F == var1 ? (float)this.field4592.musicTrackVolume : var1;
					if (this.field4592.field3576 > (float)this.field4592.musicTrackVolume) {
						this.field4592.field3576 = (float)this.field4592.musicTrackVolume;
					}

					this.field4592.midiPcmStream.setPcmStreamVolume((int)this.field4592.field3576);
					return false;
				}
			} catch (Exception var3) {
				this.method7954(var3.getMessage());
				return true;
			}

			this.field4592.field3580 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "431023974"
	)
	static int method7948(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			var4 = class380.widgetDefinition.method6348(var3);
		} else {
			var4 = var2 ? class31.scriptDotWidget : class185.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			UserComparator6.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
			FaceNormal.invalidateWidget(var4);
			VertexNormal.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				RestClientThreadFactory.revalidateWidgetScroll(class380.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			UserComparator6.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
			FaceNormal.invalidateWidget(var4);
			VertexNormal.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				RestClientThreadFactory.revalidateWidgetScroll(class380.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				FaceNormal.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
