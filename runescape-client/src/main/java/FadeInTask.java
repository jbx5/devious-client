import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	MusicSong field4625;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 964825125
	)
	int field4624;

	@ObfuscatedSignature(
		descriptor = "(Lqe;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4625 = null;
		this.field4624 = 0;
		super.field4627 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class321.field3478.size()) {
				this.field4625 = (MusicSong)class321.field3478.get(var2);
			} else if (!var3 && var2 < class321.musicSongs.size()) {
				this.field4625 = (MusicSong)class321.musicSongs.get(var2);
			}

			this.field4624 = var4;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (this.field4625 != null && this.field4625.midiPcmStream != null) {
			this.field4625.field3597 = true;

			try {
				if (this.field4625.field3602 < (float)this.field4625.musicTrackVolume && this.field4625.midiPcmStream.isReady()) {
					float var1 = this.field4624 == 0 ? (float)this.field4624 : (float)this.field4625.musicTrackVolume / (float)this.field4624;
					MusicSong var10000 = this.field4625;
					var10000.field3602 += 0.0F == var1 ? (float)this.field4625.musicTrackVolume : var1;
					if (this.field4625.field3602 > (float)this.field4625.musicTrackVolume) {
						this.field4625.field3602 = (float)this.field4625.musicTrackVolume;
					}

					this.field4625.midiPcmStream.setPcmStreamVolume((int)this.field4625.field3602);
					return false;
				}
			} catch (Exception var3) {
				this.method8017(var3.getMessage());
				return true;
			}

			this.field4625.field3597 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1973315729"
	)
	static final void method8010(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = class127.method2998(var5, var6);
		int var7 = 2048 - var3 & 2047;
		int var8 = 2048 - var4 & 2047;
		int var9 = 0;
		int var10 = 0;
		int var11 = var5;
		int var12;
		int var13;
		int var14;
		if (var7 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var7];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
			var14 = var10 * var13 - var5 * var12 >> 16;
			var11 = var13 * var5 + var12 * var10 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var8];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var14 = var12 * var11 + var13 * var9 >> 16;
			var11 = var11 * var13 - var9 * var12 >> 16;
			var9 = var14;
		}

		if (Client.isCameraLocked) {
			class362.field3961 = var0 - var9;
			ArchiveDiskAction.field4355 = var1 - var10;
			AABB.field2914 = var2 - var11;
			WorldMapCacheName.field2683 = var3;
			FriendsChat.field4736 = var4;
		} else {
			ClanMate.cameraX = var0 - var9;
			AsyncHttpResponse.cameraY = var1 - var10;
			class317.cameraZ = var2 - var11;
			FriendSystem.cameraPitch = var3;
			Script.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (Friend.oculusOrbFocalPointX >> 7 != VarpDefinition.localPlayer.x >> 7 || class59.oculusOrbFocalPointY >> 7 != VarpDefinition.localPlayer.y >> 7)) {
			var12 = VarpDefinition.localPlayer.plane;
			var13 = Projectile.baseX * 64 + (Friend.oculusOrbFocalPointX >> 7);
			var14 = GameEngine.baseY * 64 + (class59.oculusOrbFocalPointY >> 7);
			Login.method2195(var13, var14, var12, true);
		}

	}
}
