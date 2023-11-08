import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	static IndexedSprite field4547;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	MusicSong field4548;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1632604093
	)
	int field4546;

	@ObfuscatedSignature(
		descriptor = "(Lql;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4548 = null;
		this.field4546 = 0;
		super.field4552 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class316.field3416.size()) {
				this.field4548 = (MusicSong)class316.field3416.get(var2);
			} else if (!var3 && var2 < class316.musicSongs.size()) {
				this.field4548 = (MusicSong)class316.musicSongs.get(var2);
			}

			this.field4546 = var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (this.field4548 != null && this.field4548.midiPcmStream != null) {
			this.field4548.field3530 = true;

			try {
				if (this.field4548.field3528 > 0.0F && this.field4548.midiPcmStream.isReady()) {
					float var1 = this.field4546 == 0 ? (float)this.field4546 : (float)this.field4548.musicTrackVolume / (float)this.field4546;
					MusicSong var10000 = this.field4548;
					var10000.field3528 -= 0.0F == var1 ? (float)this.field4548.musicTrackVolume : var1;
					if (this.field4548.field3528 < 0.0F) {
						this.field4548.field3528 = 0.0F;
					}

					this.field4548.midiPcmStream.setPcmStreamVolume((int)this.field4548.field3528);
					return false;
				}
			} catch (Exception var3) {
				this.method7840(var3.getMessage());
				return true;
			}

			this.field4548.field3530 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ltb;",
		garbageValue = "419212113"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5074.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method9147(new Buffer(var2));
			}

			var1.method9150();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "82"
	)
	static final int method7829(int var0, int var1) {
		int var2 = NPC.method2719(var0 - 1, var1 - 1) + NPC.method2719(1 + var0, var1 - 1) + NPC.method2719(var0 - 1, 1 + var1) + NPC.method2719(var0 + 1, 1 + var1);
		int var3 = NPC.method2719(var0 - 1, var1) + NPC.method2719(var0 + 1, var1) + NPC.method2719(var0, var1 - 1) + NPC.method2719(var0, 1 + var1);
		int var4 = NPC.method2719(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1205562248"
	)
	static void method7830(int var0, int var1, int var2, int var3) {
		Widget var4 = HealthBarDefinition.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class157.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class348.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		UrlRequest.selectedSpellFlags = var2;
		class159.invalidateWidget(var4);
	}
}
