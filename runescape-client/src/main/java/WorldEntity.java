import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
@Implements("WorldEntity")
public class WorldEntity implements Entity {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 952063911
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1602664997
	)
	@Export("rotationAngle")
	public int rotationAngle;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1809855475
	)
	@Export("movementSpeed")
	public int movementSpeed;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 141059653
	)
	@Export("remainingMovementSteps")
	public int remainingMovementSteps;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1658531309
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1879734865
	)
	@Export("tileHeight")
	public int tileHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1974017269
	)
	@Export("y")
	public int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1392776237
	)
	@Export("currentRotationAngle")
	public int currentRotationAngle;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1642487981
	)
	@Export("steps")
	int steps;
	@ObfuscatedName("aq")
	@Export("directionsX")
	public int[] directionsX;
	@ObfuscatedName("al")
	@Export("directionsY")
	public int[] directionsY;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lko;"
	)
	@Export("moveSpeeds")
	MoveSpeed[] moveSpeeds;

	@ObfuscatedSignature(
		descriptor = "(IIIILgj;)V"
	)
	public WorldEntity(int var1, int var2, int var3, int var4, class173 var5) {
		this.plane = 0;
		this.rotationAngle = 0;
		this.movementSpeed = 2;
		this.remainingMovementSteps = 0;
		this.x = -1;
		this.tileHeight = -1;
		this.y = -1;
		this.currentRotationAngle = 0;
		this.steps = 0;
		this.directionsX = new int[10];
		this.directionsY = new int[10];
		this.moveSpeeds = new MoveSpeed[10];
		this.worldView = new WorldView(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-184820238"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1980644711"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.plane;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("initScenePlane")
	public void initScenePlane() {
		this.worldView.scene.Scene_plane = this.worldView.plane;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILko;I)V",
		garbageValue = "1670158766"
	)
	@Export("move")
	public final void move(int var1, int var2, MoveSpeed var3) {
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (this.directionsX[0] >= 0 && this.directionsX[0] < 104 && this.directionsY[0] >= 0 && this.directionsY[0] < 104) {
				this.updatePosition(var1, var2, var3);
			} else {
				this.setPosition(var1, var2);
			}
		} else {
			this.setPosition(var1, var2);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1437847093"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		this.steps = 0;
		this.directionsX[0] = var1;
		this.directionsY[0] = var2;
		byte var3 = 1;
		this.x = var3 * 64 + this.directionsX[0] * 128;
		this.y = this.directionsY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILko;S)V",
		garbageValue = "128"
	)
	@Export("updatePosition")
	final void updatePosition(int var1, int var2, MoveSpeed var3) {
		if (this.steps < 9) {
			++this.steps;
		}

		for (int var4 = this.steps; var4 > 0; --var4) {
			this.directionsX[var4] = this.directionsX[var4 - 1];
			this.directionsY[var4] = this.directionsY[var4 - 1];
			this.moveSpeeds[var4] = this.moveSpeeds[var4 - 1];
		}

		this.directionsX[0] = var1;
		this.directionsY[0] = var2;
		this.moveSpeeds[0] = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("updateMovement")
	public final void updateMovement() {
		int var1 = this.rotationAngle - this.currentRotationAngle & 2047;
		if (var1 != 0) {
			boolean var2 = true;
			boolean var3 = true;
			int var4 = var1 > 1024 ? -1 : 1;
			this.currentRotationAngle += (this.remainingMovementSteps > 0 ? 1 + this.movementSpeed : this.movementSpeed) * var4;
			--this.remainingMovementSteps;
			if (var1 < this.movementSpeed || var1 > 2048 - this.movementSpeed) {
				this.currentRotationAngle = this.rotationAngle;
			}

			this.currentRotationAngle &= 2047;
		}

		if (this.steps == 0) {
			this.setPosition(this.directionsX[0], this.directionsY[0]);
		} else {
			int var10 = this.x;
			int var11 = this.y;
			byte var12 = 1;
			int var5 = this.directionsX[this.steps - 1] * 128 + var12 * 128 / 2;
			int var6 = this.directionsY[this.steps - 1] * 128 + var12 * 128 / 2;
			MoveSpeed var7 = this.moveSpeeds[this.steps - 1];
			int var8 = (int)(Math.ceil((double)var7.moveSpeed) * 128.0D);
			if (var5 - var10 <= var8 && var5 - var10 >= -var8 && var6 - var11 <= var8 && var6 - var11 >= -var8) {
				byte var9 = 4;
				if (this.steps > 2) {
					var9 = 6;
				}

				if (this.steps > 3) {
					var9 = 8;
				}

				int var13 = (int)((float)var9 * var7.moveSpeed);
				if (var5 != var10 || var11 != var6) {
					if (var10 < var5) {
						this.x += var13;
						if (this.x > var5) {
							this.x = var5;
						}
					} else if (var10 > var5) {
						this.x -= var13;
						if (this.x < var5) {
							this.x = var5;
						}
					}

					if (var11 < var6) {
						this.y += var13;
						if (this.y > var6) {
							this.y = var6;
						}
					} else if (var11 > var6) {
						this.y -= var13;
						if (this.y < var6) {
							this.y = var6;
						}
					}
				}

				if (var5 == this.x && var6 == this.y) {
					--this.steps;
				}

			} else {
				this.x = var5;
				this.y = var6;
				--this.steps;
			}
		}
	}
}
