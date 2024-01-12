import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("af")
	@Export("type")
	char type;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -257601661
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("aq")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ar")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1803569924"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1930168522"
	)
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-604989476"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			byte var4 = var1.readByte();
			int var5 = var4 & 255;
			if (var5 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = class400.cp1252AsciiExtension[var5 - 128];
				if (var6 == 0) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			this.type = var3;
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "501065922"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1549455343"
	)
	public static int method3877() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2088500528"
	)
	@Export("setAuthenticationScheme")
	static final void setAuthenticationScheme(boolean var0) {
		if (var0) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		} else {
			Client.authenticationScheme = class93.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		}

	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V",
		garbageValue = "860610886"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var3;
		int var4;
		int var6;
		int var9;
		if (var0.spotAnimation >= Client.cycle) {
			int var2 = Math.max(1, var0.spotAnimation - Client.cycle);
			var9 = var0.field1175 * 423432192 + var0.field1223 * 128;
			var4 = var0.field1175 * 423432192 + var0.field1225 * 128;
			var0.x += (var9 - var0.x) / var2;
			var0.y += (var4 - var0.y) / var2;
			var0.field1245 = 0;
			var0.orientation = var0.field1173;
		} else if (var0.field1228 >= Client.cycle) {
			boolean var12 = var0.field1228 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
			if (!var12) {
				var3 = HttpMethod.SequenceDefinition_get(var0.sequence);
				if (var3 != null && !var3.isCachedModelIdSet()) {
					var12 = var0.sequenceFrameCycle + 1 > var3.frameLengths[var0.sequenceFrame];
				} else {
					var12 = true;
				}
			}

			if (var12) {
				var9 = var0.field1228 - var0.spotAnimation;
				var4 = Client.cycle - var0.spotAnimation;
				int var5 = var0.field1175 * 423432192 + var0.field1223 * 128;
				var6 = var0.field1175 * 423432192 + var0.field1225 * 128;
				int var7 = var0.field1175 * 423432192 + var0.field1224 * 128;
				int var8 = var0.field1175 * 423432192 + var0.field1226 * 128;
				var0.x = (var4 * var7 + var5 * (var9 - var4)) / var9;
				var0.y = (var8 * var4 + var6 * (var9 - var4)) / var9;
			}

			var0.field1245 = 0;
			var0.orientation = var0.field1173;
			var0.rotation = var0.orientation;
		} else {
			GraphicsObject.method2141(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1228 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.field1175 * 423432192 + var0.pathX[0] * 128;
			var0.y = var0.field1175 * 423432192 + var0.pathY[0] * 128;
			var0.method2468();
		}

		if (KeyHandler.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = 0;
			var0.field1228 = 0;
			var0.clearSpotAnimations();
			var0.x = var0.field1175 * 423432192 + var0.pathX[0] * 128;
			var0.y = var0.field1175 * 423432192 + var0.pathY[0] * 128;
			var0.method2468();
		}

		PendingSpawn.method2449(var0);
		var0.isWalking = false;
		if (var0.movementSequence != -1) {
			SequenceDefinition var10 = HttpMethod.SequenceDefinition_get(var0.movementSequence);
			if (var10 != null) {
				if (!var10.isCachedModelIdSet() && var10.frameIds != null) {
					++var0.movementFrameCycle;
					if (var0.movementFrame < var10.frameIds.length && var0.movementFrameCycle > var10.frameLengths[var0.movementFrame]) {
						var0.movementFrameCycle = 1;
						++var0.movementFrame;
						UserComparator8.method2938(var10, var0.movementFrame, var0.x, var0.y, var0);
					}

					if (var0.movementFrame >= var10.frameIds.length) {
						if (var10.frameCount > 0) {
							var0.movementFrame -= var10.frameCount;
							if (var10.field2235) {
								++var0.field1196;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var10.frameIds.length || var10.field2235 && var0.field1196 >= var10.field2242) {
								var0.movementFrameCycle = 0;
								var0.movementFrame = 0;
								var0.field1196 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						UserComparator8.method2938(var10, var0.movementFrame, var0.x, var0.y, var0);
					}
				} else if (var10.isCachedModelIdSet()) {
					++var0.movementFrame;
					var9 = var10.method4106();
					if (var0.movementFrame < var9) {
						ModeWhere.method7304(var10, var0.movementFrame, var0.x, var0.y, var0);
					} else {
						if (var10.frameCount > 0) {
							var0.movementFrame -= var10.frameCount;
							if (var10.field2235) {
								++var0.field1196;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var9 || var10.field2235 && var0.field1196 >= var10.field2242) {
								var0.movementFrame = 0;
								var0.movementFrameCycle = 0;
								var0.field1196 = 0;
							}
						} else {
							var0.movementFrameCycle = 0;
							var0.movementFrame = 0;
						}

						ModeWhere.method7304(var10, var0.movementFrame, var0.x, var0.y, var0);
					}
				} else {
					var0.movementSequence = -1;
				}
			} else {
				var0.movementSequence = -1;
			}
		}

		IterableNodeHashTableIterator var14 = new IterableNodeHashTableIterator(var0.method2455());

		for (ActorSpotAnim var13 = (ActorSpotAnim)var14.method9062(); var13 != null; var13 = (ActorSpotAnim)var14.next()) {
			if (var13.spotAnimation != -1 && Client.cycle >= var13.field5322) {
				var4 = class151.SpotAnimationDefinition_get(var13.spotAnimation).sequence;
				if (var4 == -1) {
					var13.remove();
					--var0.graphicsCount;
				} else {
					var13.spotAnimationFrame = Math.max(var13.spotAnimationFrame, 0);
					SequenceDefinition var11 = HttpMethod.SequenceDefinition_get(var4);
					if (var11.frameIds != null && !var11.isCachedModelIdSet()) {
						++var13.spotAnimationFrameCycle;
						if (var13.spotAnimationFrame < var11.frameIds.length && var13.spotAnimationFrameCycle > var11.frameLengths[var13.spotAnimationFrame]) {
							var13.spotAnimationFrameCycle = 1;
							++var13.spotAnimationFrame;
							UserComparator8.method2938(var11, var13.spotAnimationFrame, var0.x, var0.y, var0);
						}

						if (var13.spotAnimationFrame >= var11.frameIds.length) {
							var13.remove();
							--var0.graphicsCount;
						}
					} else if (var11.isCachedModelIdSet()) {
						++var13.spotAnimationFrame;
						var6 = var11.method4106();
						if (var13.spotAnimationFrame < var6) {
							ModeWhere.method7304(var11, var13.spotAnimationFrame, var0.x, var0.y, var0);
						} else {
							var13.remove();
							--var0.graphicsCount;
						}
					} else {
						var13.remove();
						--var0.graphicsCount;
					}
				}
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) {
			var3 = HttpMethod.SequenceDefinition_get(var0.sequence);
			if (var3.field2244 == 1 && var0.field1215 > 0 && var0.spotAnimation <= Client.cycle && var0.field1228 < Client.cycle) {
				var0.sequenceDelay = 1;
				return;
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) {
			var3 = HttpMethod.SequenceDefinition_get(var0.sequence);
			if (var3 == null) {
				var0.sequence = -1;
			} else if (!var3.isCachedModelIdSet() && var3.frameIds != null) {
				++var0.sequenceFrameCycle;
				if (var0.sequenceFrame < var3.frameIds.length && var0.sequenceFrameCycle > var3.frameLengths[var0.sequenceFrame]) {
					var0.sequenceFrameCycle = 1;
					++var0.sequenceFrame;
					UserComparator8.method2938(var3, var0.sequenceFrame, var0.x, var0.y, var0);
				}

				if (var0.sequenceFrame >= var3.frameIds.length) {
					var0.sequenceFrame -= var3.frameCount;
					++var0.field1220;
					if (var0.field1220 >= var3.field2242) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3.frameIds.length) {
						UserComparator8.method2938(var3, var0.sequenceFrame, var0.x, var0.y, var0);
					} else {
						var0.sequence = -1;
					}
				}

				var0.isWalking = var3.field2238;
			} else if (var3.isCachedModelIdSet()) {
				++var0.sequenceFrame;
				var4 = var3.method4106();
				if (var0.sequenceFrame < var4) {
					ModeWhere.method7304(var3, var0.sequenceFrame, var0.x, var0.y, var0);
				} else {
					var0.sequenceFrame -= var3.frameCount;
					++var0.field1220;
					if (var0.field1220 >= var3.field2242) {
						var0.sequence = -1;
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var4) {
						ModeWhere.method7304(var3, var0.sequenceFrame, var0.x, var0.y, var0);
					} else {
						var0.sequence = -1;
					}
				}
			} else {
				var0.sequence = -1;
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1382784013"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1175 * 1348793408 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = DynamicObject.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					GrandExchangeOfferOwnWorldComparator.scene.drawEntity(SecureUrlRequester.Client_plane, var2.x, var2.y, HttpRequestTask.getTileHeight(var2.field1175 * 423432192 - 64 + var2.x, var2.field1175 * 423432192 - 64 + var2.y, SecureUrlRequester.Client_plane), var2.field1175 * 423432192 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
