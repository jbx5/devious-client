import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("FriendsList")
public class FriendsList extends UserList {
   @ObfuscatedName("j")
   @Export("SpriteBuffer_spriteWidths")
   public static int[] SpriteBuffer_spriteWidths;
   @ObfuscatedName("ac")
   protected static String field4540;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   @Export("loginType")
   final LoginType loginType;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -893041511
   )
   int field4541 = 1;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("friendLoginUpdates")
   public LinkDeque friendLoginUpdates = new LinkDeque();

   @ObfuscatedSignature(
      descriptor = "(Lqj;)V"
   )
   public FriendsList(LoginType var1) {
      super(400);
      this.loginType = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Low;",
      garbageValue = "-2146736820"
   )
   @Export("newInstance")
   User newInstance() {
      return new Friend();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)[Low;",
      garbageValue = "1411048209"
   )
   @Export("newTypedArray")
   User[] newTypedArray(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lsi;ZI)Z",
      garbageValue = "-890591527"
   )
   @Export("isFriended")
   public boolean isFriended(Username var1, boolean var2) {
      Friend var3 = (Friend)this.getByUsername(var1);
      if (var3 == null) {
         return false;
      } else {
         return !var2 || var3.world != 0;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lrd;II)V",
      garbageValue = "-1435809245"
   )
   @Export("read")
   public void read(Buffer var1, int var2) {
      while(true) {
         if (var1.offset < var2) {
            boolean var3 = var1.readUnsignedByte() == 1;
            Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
            Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
            int var6 = var1.readUnsignedShort();
            int var7 = var1.readUnsignedByte();
            int var8 = var1.readUnsignedByte();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if (var6 > 0) {
               var1.readStringCp1252NullTerminated();
               var1.readUnsignedByte();
               var1.readInt();
            }

            var1.readStringCp1252NullTerminated();
            if (var4 != null && var4.hasCleanName()) {
               Friend var11 = (Friend)this.getByCurrentUsername(var4);
               if (var3) {
                  Friend var12 = (Friend)this.getByCurrentUsername(var5);
                  if (var12 != null && var11 != var12) {
                     if (var11 != null) {
                        this.remove(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.changeName(var11, var4, var5);
                  if (var6 != var11.world) {
                     boolean var14 = true;

                     for(FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
                        if (var13.username.equals(var4)) {
                           if (var6 != 0 && var13.world == 0) {
                              var13.remove();
                              var14 = false;
                           } else if (var6 == 0 && var13.world != 0) {
                              var13.remove();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
                     }
                  }
               } else {
                  if (this.getSize() >= 400) {
                     continue;
                  }

                  var11 = (Friend)this.addLast(var4, var5);
               }

               if (var6 != var11.world) {
                  var11.int2 = ++this.field4541 - 1;
                  if (var11.world == -1 && var6 == 0) {
                     var11.int2 = -(var11.int2 * -801801849) * 143588407;
                  }

                  var11.world = var6;
               }

               var11.rank = var7;
               var11.field4553 = var9;
               var11.field4552 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.sort();
         return;
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Lqn;I)Ljava/lang/Object;",
      garbageValue = "2113318877"
   )
   static Object method7543(class463 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.field4899) {
            case 1:
               return Interpreter.Interpreter_stringStack[--class20.Interpreter_stringStackSize];
            case 2:
               return Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }
}
