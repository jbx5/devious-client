import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class142 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1293495729
	)
	static int field1635;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1754172065
	)
	int field1638;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[[Lfb;"
	)
	public class134[][] field1630;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Lfb;"
	)
	class134[][] field1637;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	public Skeleton field1632;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1026400741
	)
	int field1633;
	@ObfuscatedName("ao")
	boolean field1629;
	@ObfuscatedName("ae")
	Future field1636;
	@ObfuscatedName("ad")
	List field1631;

	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;IZ)V"
	)
	class142(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1630 = null;
		this.field1637 = null;
		this.field1633 = 0;
		this.field1638 = var3;
		byte[] var5 = var1.takeFile(this.field1638 >> 16 & 65535, this.field1638 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1632 = new Skeleton(var8, var9);
		this.field1631 = new ArrayList();
		this.field1636 = class435.field4745.submit(new class141(this, var6, var7));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "-964878235"
	)
	void method3277(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1633 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1637 = new class134[this.field1632.method3879().method3827()][];
		this.field1630 = new class134[this.field1632.method3878()][];
		class133[] var4 = new class133[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class135[] var14 = new class135[]{class135.field1589, class135.field1586, class135.field1580, class135.field1583, class135.field1584, class135.field1585};
			class135 var15 = (class135)class134.findEnumerated(var14, var7);
			if (var15 == null) {
				var15 = class135.field1589;
			}

			var9 = var1.readShortSmart();
			class136 var17 = KitDefinition.method4853(var1.readUnsignedByte());
			class134 var18 = new class134();
			var18.method3216(var1, var2);
			var4[var5] = new class133(this, var18, var15, var17, var9);
			int var12 = var15.method3223();
			class134[][] var13;
			if (var15 == class135.field1586) {
				var13 = this.field1637;
			} else {
				var13 = this.field1630;
			}

			if (var13[var9] == null) {
				var13[var9] = new class134[var12];
			}

			if (var15 == class135.field1584) {
				this.field1629 = true;
			}
		}

		var5 = var3 / field1635;
		int var6 = var3 % field1635;
		int var8 = 0;

		for (var9 = 0; var9 < field1635; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1631.add(class435.field4745.submit(new class137(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1894170870"
	)
	public boolean method3288() {
		if (this.field1636 == null && this.field1631 == null) {
			return true;
		} else {
			if (this.field1636 != null) {
				if (!this.field1636.isDone()) {
					return false;
				}

				this.field1636 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1631.size(); ++var2) {
				if (!((Future)this.field1631.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1631.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1631 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-909530423"
	)
	public int method3263() {
		return this.field1633;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-767086253"
	)
	public boolean method3262() {
		return this.field1629;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILfm;IIB)V",
		garbageValue = "8"
	)
	public void method3286(int var1, class131 var2, int var3, int var4) {
		TransformationMatrix var5;
		synchronized(TransformationMatrix.field4684) {
			if (TransformationMatrix.field4683 == 0) {
				var5 = new TransformationMatrix();
			} else {
				TransformationMatrix.field4684[--TransformationMatrix.field4683].method7865();
				var5 = TransformationMatrix.field4684[TransformationMatrix.field4683];
			}
		}

		this.method3266(var5, var3, var2, var1);
		this.method3267(var5, var3, var2, var1);
		this.method3279(var5, var3, var2, var1);
		var2.method3153(var5);
		var5.method7903();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqy;ILfm;II)V",
		garbageValue = "442213311"
	)
	void method3266(TransformationMatrix var1, int var2, class131 var3, int var4) {
		float[] var5 = var3.method3142(this.field1633);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1637[var2] != null) {
			class134 var9 = this.field1637[var2][0];
			class134 var10 = this.field1637[var2][1];
			class134 var11 = this.field1637[var2][2];
			if (var9 != null) {
				var6 = var9.method3188(var4);
			}

			if (var10 != null) {
				var7 = var10.method3188(var4);
			}

			if (var11 != null) {
				var8 = var11.method3188(var4);
			}
		}

		class424 var17 = GrandExchangeOfferAgeComparator.method7406();
		var17.method7837(1.0F, 0.0F, 0.0F, var6);
		class424 var18 = GrandExchangeOfferAgeComparator.method7406();
		var18.method7837(0.0F, 1.0F, 0.0F, var7);
		class424 var19 = GrandExchangeOfferAgeComparator.method7406();
		var19.method7837(0.0F, 0.0F, 1.0F, var8);
		class424 var12 = GrandExchangeOfferAgeComparator.method7406();
		var12.method7834(var19);
		var12.method7834(var17);
		var12.method7834(var18);
		TransformationMatrix var13;
		synchronized(TransformationMatrix.field4684) {
			if (TransformationMatrix.field4683 == 0) {
				var13 = new TransformationMatrix();
			} else {
				TransformationMatrix.field4684[--TransformationMatrix.field4683].method7865();
				var13 = TransformationMatrix.field4684[TransformationMatrix.field4683];
			}
		}

		var13.method7934(var12);
		var1.method7891(var13);
		var17.method7829();
		var18.method7829();
		var19.method7829();
		var12.method7829();
		var13.method7903();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqy;ILfm;II)V",
		garbageValue = "74249267"
	)
	void method3279(TransformationMatrix var1, int var2, class131 var3, int var4) {
		float[] var5 = var3.method3136(this.field1633);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1637[var2] != null) {
			class134 var9 = this.field1637[var2][3];
			class134 var10 = this.field1637[var2][4];
			class134 var11 = this.field1637[var2][5];
			if (var9 != null) {
				var6 = var9.method3188(var4);
			}

			if (var10 != null) {
				var7 = var10.method3188(var4);
			}

			if (var11 != null) {
				var8 = var11.method3188(var4);
			}
		}

		var1.field4686[12] = var6;
		var1.field4686[13] = var7;
		var1.field4686[14] = var8;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqy;ILfm;II)V",
		garbageValue = "-1341916486"
	)
	void method3267(TransformationMatrix var1, int var2, class131 var3, int var4) {
		float[] var5 = var3.method3144(this.field1633);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1637[var2] != null) {
			class134 var9 = this.field1637[var2][6];
			class134 var10 = this.field1637[var2][7];
			class134 var11 = this.field1637[var2][8];
			if (var9 != null) {
				var6 = var9.method3188(var4);
			}

			if (var10 != null) {
				var7 = var10.method3188(var4);
			}

			if (var11 != null) {
				var8 = var11.method3188(var4);
			}
		}

		TransformationMatrix var14;
		synchronized(TransformationMatrix.field4684) {
			if (TransformationMatrix.field4683 == 0) {
				var14 = new TransformationMatrix();
			} else {
				TransformationMatrix.field4684[--TransformationMatrix.field4683].method7865();
				var14 = TransformationMatrix.field4684[TransformationMatrix.field4683];
			}
		}

		var14.method7898(var6, var7, var8);
		var1.method7891(var14);
		var14.method7903();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1521245413"
	)
	static final void method3296(String var0) {
		ReflectionCheck.method675(var0 + " is already on your friend list");
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Lkr;IIIZI)V",
		garbageValue = "2102026355"
	)
	static void method3293(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length && var0.soundEffects[var1] != null) {
				int var5 = var0.soundEffects[var1].field2727 & 31;
				if ((var5 <= 0 || TileItem.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || TileItem.clientPreferences.getSoundEffectsVolume() != 0)) {
					MusicPatchNode.method6473(var0.soundEffects[var1], var2, var3, var4);
				}
			}
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIIIIIII)V",
		garbageValue = "614855876"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			long var10 = 0L;
			boolean var12 = true;
			boolean var13 = false;
			boolean var14 = false;
			if (var2 == 0) {
				var10 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var10 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var10 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var10 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var15;
			if (0L != var10) {
				var15 = var9.getObjectFlags(var1, var3, var4, var10);
				int var42 = class513.Entity_unpackID(var10);
				int var43 = var15 & 31;
				int var44 = var15 >> 6 & 3;
				ObjectComposition var16 = class222.getObjectDefinition(var42);
				class368.method7145(var1, var3, var4, var16, var44);
				if (var2 == 0) {
					var9.removeBoundaryObject(var1, var3, var4);
					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method5393(var3, var4, var43, var44, var16.boolean1);
					}
				}

				if (var2 == 1) {
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var16.sizeX > var0.sizeX - 1 || var4 + var16.sizeX > var0.sizeY - 1 || var3 + var16.sizeY > var0.sizeX - 1 || var4 + var16.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var16.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var16.sizeX, var16.sizeY, var44, var16.boolean1);
					}
				}

				if (var2 == 3) {
					var9.removeFloorDecoration(var1, var3, var4);
					if (var16.interactType == 1) {
						var0.collisionMaps[var1].method5396(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var15 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var15 = var1 + 1;
				}

				CollisionMap var45 = var0.collisionMaps[var1];
				ObjectComposition var17 = class222.getObjectDefinition(var5);
				int var18 = var8 >= 0 ? var8 : var17.animationId;
				int var19;
				int var20;
				if (var6 != 1 && var6 != 3) {
					var19 = var17.sizeX;
					var20 = var17.sizeY;
				} else {
					var19 = var17.sizeY;
					var20 = var17.sizeX;
				}

				int var21;
				int var22;
				if (var3 + var19 <= var0.sizeX) {
					var21 = var3 + (var19 >> 1);
					var22 = var3 + (var19 + 1 >> 1);
				} else {
					var21 = var3;
					var22 = var3 + 1;
				}

				int var23;
				int var24;
				if (var20 + var4 <= var0.sizeY) {
					var23 = (var20 >> 1) + var4;
					var24 = var4 + (var20 + 1 >> 1);
				} else {
					var23 = var4;
					var24 = var4 + 1;
				}

				int[][] var25 = var0.tileHeights[var15];
				int var26 = var25[var21][var24] + var25[var21][var23] + var25[var22][var23] + var25[var22][var24] >> 2;
				int var27 = (var3 << 7) + (var19 << 6);
				int var28 = (var4 << 7) + (var20 << 6);
				Scene var29 = var0.scene;
				long var30 = class218.calculateTag(var3, var4, 2, var17.int1 == 0, var5, var0.id);
				int var32 = (var6 << 6) + var7;
				if (var17.int3 == 1) {
					var32 += 256;
				}

				Object var40;
				if (var7 == 22) {
					if (var18 == -1 && var17.transforms == null) {
						var40 = var17.getModel(22, var6, var25, var27, var26, var28);
					} else {
						var40 = new DynamicObject(var0, var5, 22, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
					}

					var29.newFloorDecoration(var1, var3, var4, var26, (Renderable)var40, var30, var32);
					if (var17.interactType == 1 && var45 != null) {
						var45.setBlockedByFloorDec(var3, var4);
					}
				} else if (var7 != 10 && var7 != 11) {
					if (var7 >= 12) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(var7, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.method3919(var1, var3, var4, var26, 1, 1, (Renderable)var40, 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
						}
					} else if (var7 == 0) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(0, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, 0, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1015[var6], 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.method5388(var3, var4, var7, var6, var17.boolean1);
						}
					} else if (var7 == 1) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(1, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, 1, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1023[var6], 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.method5388(var3, var4, var7, var6, var17.boolean1);
						}
					} else {
						int var33;
						if (var7 == 2) {
							var33 = var6 + 1 & 3;
							Object var35;
							Object var41;
							if (var18 == -1 && var17.transforms == null) {
								var41 = var17.getModel(2, var6 + 4, var25, var27, var26, var28);
								var35 = var17.getModel(2, var33, var25, var27, var26, var28);
							} else {
								var41 = new DynamicObject(var0, var5, 2, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								var35 = new DynamicObject(var0, var5, 2, var33, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var41, (Renderable)var35, Tiles.field1015[var6], Tiles.field1015[var33], var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.method5388(var3, var4, var7, var6, var17.boolean1);
							}
						} else if (var7 == 3) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(3, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, 3, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1023[var6], 0, var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.method5388(var3, var4, var7, var6, var17.boolean1);
							}
						} else if (var7 == 9) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(var7, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.method3919(var1, var3, var4, var26, 1, 1, (Renderable)var40, 0, var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
							}
						} else if (var7 == 4) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(4, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1015[var6], 0, 0, 0, var30, var32);
						} else {
							long var34;
							Object var36;
							if (var7 == 5) {
								var33 = 16;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (0L != var34) {
									var33 = class222.getObjectDefinition(class513.Entity_unpackID(var34)).int2;
								}

								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)null, Tiles.field1015[var6], 0, Tiles.field1017[var6] * var33, Tiles.field1025[var6] * var33, var30, var32);
							} else if (var7 == 6) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = class222.getObjectDefinition(class513.Entity_unpackID(var34)).int2 / 2;
								}

								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6 + 4, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)null, 256, var6, Tiles.field1026[var6] * var33, Tiles.field1022[var6] * var33, var30, var32);
							} else if (var7 == 7) {
								int var39 = var6 + 2 & 3;
								if (var18 == -1 && var17.transforms == null) {
									var40 = var17.getModel(4, var39 + 4, var25, var27, var26, var28);
								} else {
									var40 = new DynamicObject(var0, var5, 4, var39 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, 256, var39, 0, 0, var30, var32);
							} else if (var7 == 8) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = class222.getObjectDefinition(class513.Entity_unpackID(var34)).int2 / 2;
								}

								int var38 = var6 + 2 & 3;
								Object var37;
								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6 + 4, var25, var27, var26, var28);
									var37 = var17.getModel(4, var38 + 4, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
									var37 = new DynamicObject(var0, var5, 4, var38 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)var37, 256, var6, Tiles.field1026[var6] * var33, Tiles.field1022[var6] * var33, var30, var32);
							}
						}
					}
				} else {
					if (var18 == -1 && var17.transforms == null) {
						var40 = var17.getModel(10, var6, var25, var27, var26, var28);
					} else {
						var40 = new DynamicObject(var0, var5, 10, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
					}

					if (var40 != null) {
						var29.method3919(var1, var3, var4, var26, var19, var20, (Renderable)var40, var7 == 11 ? 256 : 0, var30, var32);
					}

					if (var17.interactType != 0 && var45 != null) {
						var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
					}
				}

				var17 = class222.getObjectDefinition(var5);
				if (var17 != null && var17.hasSound()) {
					class224.createObjectSound(var15, var3, var4, var17, var6);
				}
			}
		}

	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Lvs;B)V",
		garbageValue = "1"
	)
	static final void method3294(WorldView var0, PacketBuffer var1) {
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		if (var2 < var0.npcCount) {
			for (var3 = var2; var3 < var0.npcCount; ++var3) {
				Client.field584[++Client.field637 - 1] = var0.npcIndices[var3];
			}
		}

		if (var2 > var0.npcCount) {
			throw new RuntimeException("");
		} else {
			var0.npcCount = 0;

			for (var3 = 0; var3 < var2; ++var3) {
				int var4 = var0.npcIndices[var3];
				NPC var5 = var0.npcs[var4];
				int var6 = var1.readBits(1);
				if (var6 == 0) {
					var0.npcIndices[++var0.npcCount - 1] = var4;
					var5.npcCycle = Client.cycle;
				} else {
					int var7 = var1.readBits(2);
					if (var7 == 0) {
						var0.npcIndices[++var0.npcCount - 1] = var4;
						var5.npcCycle = Client.cycle;
						Client.npcIndices[++Client.npcCount - 1] = var4;
					} else {
						int var8;
						int var9;
						if (var7 == 1) {
							var0.npcIndices[++var0.npcCount - 1] = var4;
							var5.npcCycle = Client.cycle;
							var8 = var1.readBits(3);
							var5.method2778(var8, MoveSpeed.field2983);
							var9 = var1.readBits(1);
							if (var9 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 2) {
							var0.npcIndices[++var0.npcCount - 1] = var4;
							var5.npcCycle = Client.cycle;
							if (var1.readBits(1) == 1) {
								var8 = var1.readBits(3);
								var5.method2778(var8, MoveSpeed.field2984);
								var9 = var1.readBits(3);
								var5.method2778(var9, MoveSpeed.field2984);
							} else {
								var8 = var1.readBits(3);
								var5.method2778(var8, MoveSpeed.field2987);
							}

							var8 = var1.readBits(1);
							if (var8 == 1) {
								Client.npcIndices[++Client.npcCount - 1] = var4;
							}
						} else if (var7 == 3) {
							Client.field584[++Client.field637 - 1] = var4;
						}
					}
				}
			}

		}
	}
}
