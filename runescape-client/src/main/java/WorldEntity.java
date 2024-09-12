import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("WorldEntity")
public class WorldEntity implements Entity {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 171277605
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1236389361
	)
	public int field5006;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 187174063
	)
	@Export("rotationAngle")
	public int rotationAngle;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -604114995
	)
	@Export("movementSpeed")
	public int movementSpeed;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 562800021
	)
	@Export("remainingMovementSteps")
	public int remainingMovementSteps;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -962238781
	)
	@Export("x")
	public int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1729802843
	)
	@Export("tileHeight")
	public int tileHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1958743463
	)
	@Export("y")
	public int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1295026153
	)
	@Export("currentRotationAngle")
	public int currentRotationAngle;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -553403479
	)
	@Export("steps")
	int steps;
	@ObfuscatedName("ad")
	@Export("directionsX")
	public int[] directionsX;
	@ObfuscatedName("ah")
	@Export("directionsY")
	public int[] directionsY;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	@Export("moveSpeeds")
	MoveSpeed[] moveSpeeds;

	@ObfuscatedSignature(
		descriptor = "(ILdd;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
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
		this.worldView = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2084253353"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "18679"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "371855163"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.plane;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	@Export("initScenePlane")
	public void initScenePlane() {
		this.worldView.scene.Scene_plane = this.worldView.plane;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILkk;I)V",
		garbageValue = "-236634947"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1522724135"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		this.steps = 0;
		this.directionsX[0] = var1;
		this.directionsY[0] = var2;
		byte var3 = 1;
		this.x = this.directionsX[0] * 128 + var3 * 64;
		this.y = var3 * 64 + this.directionsY[0] * 128;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILkk;I)V",
		garbageValue = "-2118276083"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "88744644"
	)
	@Export("updateMovement")
	public final void updateMovement() {
		int var1 = this.rotationAngle - this.currentRotationAngle & 2047;
		if (var1 != 0) {
			boolean var2 = true;
			boolean var3 = true;
			int var4 = var1 > 1024 ? -1 : 1;
			this.currentRotationAngle += var4 * (this.remainingMovementSteps > 0 ? this.movementSpeed + 1 : this.movementSpeed);
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
				if (var5 != var10 || var6 != var11) {
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
