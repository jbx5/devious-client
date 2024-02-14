import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("aq")
	@Export("args")
	Object[] args;
	@ObfuscatedName("aw")
	boolean field1095;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 419142951
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1947092785
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1652910979
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 407049349
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1688799383
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("au")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 966091511
	)
	int field1102;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 585647715
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "-36"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-534052566"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "-53018263"
	)
	public void method2355(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "57"
	)
	@Export("setAuthenticationScheme")
	static final void setAuthenticationScheme(boolean var0) {
		if (var0) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		} else {
			Client.authenticationScheme = class30.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		}

	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1506392323"
	)
	static final void method2360(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (FriendSystem.cameraPitch < var0) {
			FriendSystem.cameraPitch = (var0 - FriendSystem.cameraPitch) * AsyncHttpResponse.field86 / 1000 + FriendSystem.cameraPitch + class135.field1618;
			if (FriendSystem.cameraPitch > var0) {
				FriendSystem.cameraPitch = var0;
			}
		} else if (FriendSystem.cameraPitch > var0) {
			FriendSystem.cameraPitch -= (FriendSystem.cameraPitch - var0) * AsyncHttpResponse.field86 / 1000 + class135.field1618;
			if (FriendSystem.cameraPitch < var0) {
				FriendSystem.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - Script.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			Script.cameraYaw = Script.cameraYaw + class135.field1618 + var2 * AsyncHttpResponse.field86 / 1000;
			Script.cameraYaw &= 2047;
		} else if (var2 < 0) {
			Script.cameraYaw -= class135.field1618 + -var2 * AsyncHttpResponse.field86 / 1000;
			Script.cameraYaw &= 2047;
		}

		int var3 = var1 - Script.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			Script.cameraYaw = var1;
		}

	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IS)V",
		garbageValue = "-7046"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var4;
		int var5;
		int var6;
		int var9;
		if (var0.spotAnimation >= Client.cycle) {
			class47.method841(var0);
		} else if (var0.field1271 >= Client.cycle) {
			boolean var2 = var0.field1271 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
			if (!var2) {
				SequenceDefinition var3 = MilliClock.SequenceDefinition_get(var0.sequence);
				if (var3 != null && !var3.isCachedModelIdSet()) {
					var2 = var0.sequenceFrameCycle + 1 > var3.frameLengths[var0.sequenceFrame];
				} else {
					var2 = true;
				}
			}

			if (var2) {
				var9 = var0.field1271 - var0.spotAnimation;
				var4 = Client.cycle - var0.spotAnimation;
				var5 = var0.field1257 * 128 + var0.field1212 * 64;
				var6 = var0.field1259 * 128 + var0.field1212 * 64;
				int var7 = var0.field1258 * 128 + var0.field1212 * 64;
				int var8 = var0.field1248 * 128 + var0.field1212 * 64;
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9;
				var0.y = (var4 * var8 + var6 * (var9 - var4)) / var9;
			}

			var0.field1279 = 0;
			var0.orientation = var0.field1223;
			var0.rotation = var0.orientation;
		} else {
			WorldMapLabelSize.method4623(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1271 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.pathX[0] * 128 + var0.field1212 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1212 * 64;
			var0.method2462();
		}

		if (VarpDefinition.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1271 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.pathX[0] * 128 + var0.field1212 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1212 * 64;
			var0.method2462();
		}

		if (var0.targetIndex != -1) {
			Object var10 = null;
			var9 = 65536;
			if (var0.targetIndex < var9) {
				var10 = Client.npcs[var0.targetIndex];
			} else {
				var10 = Client.players[var0.targetIndex - var9];
			}

			if (var10 != null) {
				var4 = var0.x - ((Actor)var10).x;
				var5 = var0.y - ((Actor)var10).y;
				if (var4 != 0 || var5 != 0) {
					var0.orientation = ServerPacket.method6052(var4, var5);
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		int var12;
		if (var0.pathLength == 0 || var0.field1279 > 0) {
			var12 = -1;
			if (var0.field1243 != -1 && var0.field1244 != -1) {
				var9 = var0.field1243 * 128 - Projectile.baseX * 8192 + 64;
				var4 = var0.field1244 * 128 - GameEngine.baseY * 8192 + 64;
				var5 = var0.x - var9;
				var6 = var0.y - var4;
				if (var5 != 0 || var6 != 0) {
					var12 = ServerPacket.method6052(var5, var6);
				}
			} else if (var0.field1242 != -1) {
				var12 = var0.field1242;
			}

			if (var12 != -1) {
				var0.orientation = var12;
				if (var0.field1245) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method2470();
		}

		var12 = var0.orientation - var0.rotation & 2047;
		if (var12 != 0) {
			boolean var15 = true;
			boolean var13 = true;
			++var0.field1227;
			var5 = var12 > 1024 ? -1 : 1;
			var0.rotation += var0.field1249 * var5;
			boolean var14 = true;
			if (var12 < var0.field1249 || var12 > 2048 - var0.field1249) {
				var0.rotation = var0.orientation;
				var14 = false;
			}

			if (var0.field1249 > 0 && var0.idleSequence == var0.movementSequence && (var0.field1227 > 25 || var14)) {
				if (var5 == -1 && var0.turnLeftSequence != -1) {
					var0.movementSequence = var0.turnLeftSequence;
				} else if (var5 == 1 && var0.turnRightSequence != -1) {
					var0.movementSequence = var0.turnRightSequence;
				} else {
					var0.movementSequence = var0.walkSequence;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field1227 = 0;
		}

		class439.method8184(var0);
	}
}
