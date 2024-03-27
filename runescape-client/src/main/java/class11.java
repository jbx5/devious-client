import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("ag")
class class11 implements TlsAuthentication {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field57 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;Loc;Ljava/util/ArrayList;I)Z",
		garbageValue = "840469582"
	)
	public static boolean method109(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class321.field3493 = var0;
		class321.field3494 = var1;
		class321.field3497 = var2;
		class321.field3491 = var3;
		return true;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-53"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class529.World_request == null) {
				class529.World_request = class94.urlRequester.request(new URL(class128.field1538));
			} else if (class529.World_request.isDone()) {
				byte[] var0 = class529.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				FloorUnderlayDefinition.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class529.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class529.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "44"
	)
	public static void method108(int var0, int var1) {
		WorldMapSection2.method5289(var0, var1, 0, 0);
		class321.field3496.clear();
		class321.field3498.clear();
		if (class321.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			WorldMapEvent.method5834();
		} else {
			class321.field3498.add(new DelayFadeTask((SongTask)null, class321.musicPlayerStatus));
			class321.field3498.add(new FadeOutTask((SongTask)null, 0, false, class321.field3501));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class321.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var3.add(var5);
			}

			class321.field3498.add(new class421((SongTask)null, var3));
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	protected static final void method103() {
		GameEngine.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		VertexNormal.gameCyclesToDo = 0;
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "85657971"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class170.method3431();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var4 = UserComparator8.VarpDefinition_get(var0).type;
		if (var4 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var4 == 1) {
				if (var2 == 1) {
					ReflectionCheck.method669(0.9D);
				}

				if (var2 == 2) {
					ReflectionCheck.method669(0.8D);
				}

				if (var2 == 3) {
					ReflectionCheck.method669(0.7D);
				}

				if (var2 == 4) {
					ReflectionCheck.method669(0.6D);
				}
			}

			if (var4 == 3) {
				if (var2 == 0) {
					InvDefinition.setMusicVolume(255);
				}

				if (var2 == 1) {
					InvDefinition.setMusicVolume(192);
				}

				if (var2 == 2) {
					InvDefinition.setMusicVolume(128);
				}

				if (var2 == 3) {
					InvDefinition.setMusicVolume(64);
				}

				if (var2 == 4) {
					InvDefinition.setMusicVolume(0);
				}
			}

			if (var4 == 4) {
				if (var2 == 0) {
					class522.method9128(127);
				}

				if (var2 == 1) {
					class522.method9128(96);
				}

				if (var2 == 2) {
					class522.method9128(64);
				}

				if (var2 == 3) {
					class522.method9128(32);
				}

				if (var2 == 4) {
					class522.method9128(0);
				}
			}

			if (var4 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var4 == 6) {
				Client.chatEffects = var2;
			}

			if (var4 == 9) {
			}

			if (var4 == 10) {
				if (var2 == 0) {
					ObjectSound.method1921(127);
				}

				if (var2 == 1) {
					ObjectSound.method1921(96);
				}

				if (var2 == 2) {
					ObjectSound.method1921(64);
				}

				if (var2 == 3) {
					ObjectSound.method1921(32);
				}

				if (var2 == 4) {
					ObjectSound.method1921(0);
				}
			}

			if (var4 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var4 == 18) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.field1358, AttackOption.field1360, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick};
				Client.playerAttackOption = (AttackOption)KitDefinition.findEnumerated(var3, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var4 == 22) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.field1358, AttackOption.field1360, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick};
				Client.npcAttackOption = (AttackOption)KitDefinition.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
