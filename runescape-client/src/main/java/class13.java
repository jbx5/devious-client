import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ap")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1194566833
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final SecureRandomSSLSocket this$1;

	@ObfuscatedSignature(
		descriptor = "(Laq;)V"
	)
	class13(SecureRandomSSLSocket var1) {
		this.this$1 = var1;
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (var1 == null) {
			var1 = new Hashtable();
		}

		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-446061462"
	)
	static int method164(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = class534.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class147.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = class459.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class459.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "709224351"
	)
	@Export("clear")
	static final void clear() {
		class233.method4496();
		ReflectionCheck.method701();
		class194.field1915.clear();
		class30.method445();
		class175.method3577();
		EnumComposition.EnumDefinition_cached.clear();
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		class194.method3797();
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
		class177.method3602();
		class193.field1913.clear();
		KitDefinition.KitDefinition_cached.clear();
		UrlRequest.method2943();
		Skeleton.method4849();
		WorldMapElement.HitSplatDefinition_cached.clear();
		class140.method3143();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class47.method888();
		class234.method4499();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		StructComposition.StructDefinition_cached.clear();
		WorldMapCacheName.method6011();
		if (Tile.field2639 != null) {
			Tile.field2639.method9467();
		}

		if (ApproximateRouteStrategy.field491 != null) {
			ApproximateRouteStrategy.field491.method9467();
		}

		class210.field2100.clear();
		class212.field2022.clear();
		UserComparator9.method2989();
		ViewportMouse.method5347();
		class192.field1842.clear();
		class147.method3236();
		SoundSystem.method855();
		VarpDefinition.VarpDefinition_cached.clear();
		class109.method2770();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3758.clearFiles();
		PlayerComposition.field3766 = 0;
		if (AsyncRestClient.widgetDefinition != null) {
			AsyncRestClient.widgetDefinition.method6550();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		Script.Script_cached.clear();
		Client.field819.clearFiles();
		if (WorldMapRegion.field3093 != null) {
			WorldMapRegion.field3093.clearFiles();
		}

		if (class324.field3552 != null) {
			class324.field3552.clearFiles();
		}

		if (class138.archive10 != null) {
			class138.archive10.clearFiles();
		}

		if (class438.archive12 != null) {
			class438.archive12.clearFiles();
		}

		if (Projection.archive2 != null) {
			Projection.archive2.clearFiles();
		}

		if (HealthBar.field1357 != null) {
			HealthBar.field1357.clearFiles();
		}

		if (ClientPacket.field3374 != null) {
			ClientPacket.field3374.clearFiles();
		}

		if (class104.archive13 != null) {
			class104.archive13.clearFiles();
		}

		if (LoginState.archive4 != null) {
			LoginState.archive4.clearFiles();
		}

		if (DynamicObject.field1038 != null) {
			DynamicObject.field1038.clearFiles();
		}

		if (class135.field1637 != null) {
			class135.field1637.clearFiles();
		}

		if (class333.field3643 != null) {
			class333.field3643.clearFiles();
		}

		if (SceneTilePaint.archive9 != null) {
			SceneTilePaint.archive9.clearFiles();
		}

		if (GameObject.archive6 != null) {
			GameObject.archive6.clearFiles();
		}

		if (Varcs.field1452 != null) {
			Varcs.field1452.clearFiles();
		}

		if (class141.field1656 != null) {
			class141.field1656.clearFiles();
		}

		if (class177.archive8 != null) {
			class177.archive8.clearFiles();
		}

		if (HttpResponse.field105 != null) {
			HttpResponse.field105.clearFiles();
		}

		if (class332.field3638 != null) {
			class332.field3638.clearFiles();
		}

		if (class133.field1602 != null) {
			class133.field1602.clearFiles();
		}

		if (class53.field370 != null) {
			class53.field370.clearFiles();
		}

		if (class327.field3564 != null) {
			class327.field3564.clearFiles();
		}

	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1362750915"
	)
	static final int method166(int var0) {
		return Math.abs(var0 - class206.cameraYaw) > 1024 ? (var0 < class206.cameraYaw ? 1 : -1) * 2048 + var0 : var0;
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)Lnb;",
		garbageValue = "-1042332838"
	)
	static Widget method167(Widget var0) {
		int var1 = class327.method6223(class160.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = AsyncRestClient.widgetDefinition.method6536(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
