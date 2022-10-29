import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("UserList")
public abstract class UserList {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1695015859
   )
   @Export("capacity")
   final int capacity;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -486443911
   )
   @Export("size")
   int size = 0;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "[Loj;"
   )
   @Export("array")
   User[] array;
   @ObfuscatedName("s")
   @Export("usernamesMap")
   HashMap usernamesMap;
   @ObfuscatedName("p")
   @Export("previousUsernamesMap")
   HashMap previousUsernamesMap;
   @ObfuscatedName("b")
   @Export("comparator")
   Comparator comparator = null;

   UserList(int var1) {
      this.capacity = var1;
      this.array = this.newTypedArray(var1);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)Loj;",
      garbageValue = "31"
   )
   @Export("newInstance")
   abstract User newInstance();

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)[Loj;",
      garbageValue = "-41299588"
   )
   @Export("newTypedArray")
   abstract User[] newTypedArray(int var1);

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1953629195"
   )
   @Export("clear")
   public void clear() {
      this.size = 0;
      Arrays.fill(this.array, (Object)null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "936617473"
   )
   @Export("getSize")
   public int getSize() {
      return this.size;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1838216958"
   )
   @Export("isFull")
   public boolean isFull() {
      return this.size == this.capacity;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lrg;I)Z",
      garbageValue = "-1635365855"
   )
   @Export("contains")
   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lrg;B)Loj;",
      garbageValue = "12"
   )
   @Export("getByUsername")
   public User getByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      return var2 != null ? var2 : this.getByPreviousUsername(var1);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lrg;B)Loj;",
      garbageValue = "-16"
   )
   @Export("getByCurrentUsername")
   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lrg;I)Loj;",
      garbageValue = "2070159512"
   )
   @Export("getByPreviousUsername")
   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lrg;B)Z",
      garbageValue = "-61"
   )
   @Export("removeByUsername")
   public final boolean removeByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      if (var2 == null) {
         return false;
      } else {
         this.remove(var2);
         return true;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)V",
      garbageValue = "-691454376"
   )
   @Export("remove")
   final void remove(User var1) {
      int var2 = this.indexOf(var1);
      if (var2 != -1) {
         this.arrayRemove(var2);
         this.mapRemove(var1);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lrg;I)Loj;",
      garbageValue = "-2054707737"
   )
   @Export("addLastNoPreviousUsername")
   User addLastNoPreviousUsername(Username var1) {
      return this.addLast(var1, (Username)null);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lrg;Lrg;I)Loj;",
      garbageValue = "-645107578"
   )
   @Export("addLast")
   User addLast(Username var1, Username var2) {
      if (this.getByCurrentUsername(var1) != null) {
         throw new IllegalStateException();
      } else {
         User var3 = this.newInstance();
         var3.set(var1, var2);
         this.arrayAddLast(var3);
         this.mapPut(var3);
         return var3;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)Loj;",
      garbageValue = "221714526"
   )
   @Export("get")
   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.size) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1037280537"
   )
   @Export("sort")
   public final void sort() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size);
      } else {
         Arrays.sort(this.array, 0, this.size, this.comparator);
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Loj;Lrg;Lrg;I)V",
      garbageValue = "165259804"
   )
   @Export("changeName")
   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)I",
      garbageValue = "-1422965268"
   )
   @Export("indexOf")
   final int indexOf(User var1) {
      for(int var2 = 0; var2 < this.size; ++var2) {
         if (this.array[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)V",
      garbageValue = "-641917828"
   )
   @Export("mapRemove")
   final void mapRemove(User var1) {
      if (this.usernamesMap.remove(var1.username) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.previousUsername != null) {
            this.previousUsernamesMap.remove(var1.previousUsername);
         }

      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Loj;I)V",
      garbageValue = "-792727175"
   )
   @Export("arrayAddLast")
   final void arrayAddLast(User var1) {
      this.array[++this.size - 1] = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Loj;B)V",
      garbageValue = "-43"
   )
   @Export("mapPut")
   final void mapPut(User var1) {
      this.usernamesMap.put(var1.username, var1);
      if (var1.previousUsername != null) {
         User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
         if (var2 != null && var2 != var1) {
            var2.previousUsername = null;
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2142344104"
   )
   @Export("arrayRemove")
   final void arrayRemove(int var1) {
      --this.size;
      if (var1 < this.size) {
         System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-38"
   )
   @Export("removeComparator")
   public final void removeComparator() {
      this.comparator = null;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "1295085332"
   )
   @Export("addComparator")
   public final void addComparator(Comparator var1) {
      if (this.comparator == null) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;Llg;ZII)V",
      garbageValue = "-2066181658"
   )
   static void method7441(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
      if (Login.clearLoginScreen) {
         if (var3 == 4) {
            GrandExchangeOfferOwnWorldComparator.method1171(4);
         }

      } else {
         if (var3 == 0) {
            GrandExchangeEvents.method6463(var2);
         } else {
            GrandExchangeOfferOwnWorldComparator.method1171(var3);
         }

         Rasterizer2D.Rasterizer2D_clear();
         byte[] var4 = var0.takeFileByNames("title.jpg", "");
         class313.leftTitleSprite = KeyHandler.method394(var4);
         HealthBar.rightTitleSprite = class313.leftTitleSprite.mirrorHorizontally();
         int var5 = Client.worldProperties;
         if ((var5 & 536870912) != 0) {
            MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
         } else if ((var5 & 1073741824) != 0) {
            MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
         } else if ((var5 & 256) != 0) {
            MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
         } else {
            MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
         }

         class356.titleboxSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
         class143.titlebuttonSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
         class362.field4314 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
         class138.field1609 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
         AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
         class239.runesSprite = class410.method7741(var1, "runes", "");
         class16.title_muteSprite = class410.method7741(var1, "title_mute", "");
         Login.options_buttons_0Sprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
         MouseRecorder.field1059 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
         class181.options_buttons_2Sprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
         class341.field4230 = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
         ModeWhere.field4271 = Login.options_buttons_0Sprite.subWidth;
         Login.field915 = Login.options_buttons_0Sprite.subHeight;
         GraphicsObject.loginScreenRunesAnimation = new LoginScreenAnimation(class239.runesSprite);
         if (var2) {
            Login.Login_username = "";
            Login.Login_password = "";
            Login.field914 = new String[8];
            Login.field913 = 0;
         }

         class360.field4308 = 0;
         class355.otp = "";
         Login.field900 = true;
         Login.worldSelectOpen = false;
         if (!BufferedSink.clientPreferences.method2383()) {
            FloorUnderlayDefinition.method3623(2, ReflectionCheck.archive6, "scape main", "", 255, false);
         } else {
            class283.musicPlayerStatus = 1;
            DevicePcmPlayerProvider.musicTrackArchive = null;
            class283.musicTrackGroupId = -1;
            class283.musicTrackFileId = -1;
            Messages.musicTrackVolume = 0;
            GrandExchangeEvents.musicTrackBoolean = false;
            class19.pcmSampleLength = 2;
         }

         MouseHandler.method697(false);
         Login.clearLoginScreen = true;
         Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
         Login.loginBoxX = Login.xPadding + 202;
         Canvas.loginBoxCenter = Login.loginBoxX + 180;
         class313.leftTitleSprite.drawAt(Login.xPadding, 0);
         HealthBar.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         MouseRecorder.logoSprite.drawAt(Login.xPadding + 382 - MouseRecorder.logoSprite.subWidth / 2, 18);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SI)V",
      garbageValue = "-2135224371"
   )
   public static void method7442(String[] var0, short[] var1) {
      VarpDefinition.sortItemsByName(var0, var1, 0, var0.length - 1);
   }
}
