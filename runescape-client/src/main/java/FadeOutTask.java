import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("bg")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	MusicSong field4622;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1681384595
	)
	int field4621;

	@ObfuscatedSignature(
		descriptor = "(Lqe;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4622 = null;
		this.field4621 = 0;
		super.field4627 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class321.field3478.size()) {
				this.field4622 = (MusicSong)class321.field3478.get(var2);
			} else if (!var3 && var2 < class321.musicSongs.size()) {
				this.field4622 = (MusicSong)class321.musicSongs.get(var2);
			}

			this.field4621 = var4;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (this.field4622 != null && this.field4622.midiPcmStream != null) {
			this.field4622.field3597 = true;

			try {
				if (this.field4622.field3602 > 0.0F && this.field4622.midiPcmStream.isReady()) {
					float var1 = this.field4621 == 0 ? (float)this.field4621 : (float)this.field4622.musicTrackVolume / (float)this.field4621;
					MusicSong var10000 = this.field4622;
					var10000.field3602 -= var1 == 0.0F ? (float)this.field4622.musicTrackVolume : var1;
					if (this.field4622.field3602 < 0.0F) {
						this.field4622.field3602 = 0.0F;
					}

					this.field4622.midiPcmStream.setPcmStreamVolume((int)this.field4622.field3602);
					return false;
				}
			} catch (Exception var3) {
				this.method8017(var3.getMessage());
				return true;
			}

			this.field4622.field3597 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lmn;",
		garbageValue = "0"
	)
	static PacketBufferNode method8005() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Luf;",
		garbageValue = "1884121148"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5151.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9374(new Buffer(var2));
			}

			var1.method9377();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
