import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
   @ObfuscatedName("vk")
   @ObfuscatedGetter(
      intValue = -1732549567
   )
   @Export("viewportOffsetX")
   static int viewportOffsetX;
   @ObfuscatedName("va")
   @ObfuscatedGetter(
      intValue = 1294513815
   )
   @Export("viewportOffsetY")
   static int viewportOffsetY;
   @ObfuscatedName("wq")
   @ObfuscatedGetter(
      intValue = 1840205411
   )
   public static int field574;
   @ObfuscatedName("tt")
   @Export("playingJingle")
   static boolean playingJingle;
   @ObfuscatedName("wa")
   @ObfuscatedSignature(
      descriptor = "Lcy;"
   )
   static final ApproximateRouteStrategy field571;
   @ObfuscatedName("tc")
   @Export("isCameraLocked")
   static boolean isCameraLocked;
   @ObfuscatedName("uq")
   static boolean field737;
   @ObfuscatedName("wi")
   static int[] field542;
   @ObfuscatedName("wy")
   static int[] field773;
   @ObfuscatedName("ve")
   @ObfuscatedGetter(
      intValue = -1846454579
   )
   static int field756;
   @ObfuscatedName("vn")
   @ObfuscatedSignature(
      descriptor = "Llc;"
   )
   @Export("playerAppearance")
   static PlayerComposition playerAppearance;
   @ObfuscatedName("ts")
   @ObfuscatedGetter(
      intValue = -305966553
   )
   @Export("soundEffectCount")
   static int soundEffectCount;
   @ObfuscatedName("tx")
   @Export("soundEffectIds")
   static int[] soundEffectIds;
   @ObfuscatedName("vv")
   @ObfuscatedGetter(
      intValue = -131617713
   )
   static int field718;
   @ObfuscatedName("ta")
   @Export("queuedSoundEffectLoops")
   static int[] queuedSoundEffectLoops;
   @ObfuscatedName("tq")
   @Export("queuedSoundEffectDelays")
   static int[] queuedSoundEffectDelays;
   @ObfuscatedName("tb")
   @ObfuscatedSignature(
      descriptor = "[Lbt;"
   )
   @Export("soundEffects")
   static SoundEffect[] soundEffects;
   @ObfuscatedName("to")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("wk")
   @Export("archiveLoaders")
   static ArrayList archiveLoaders;
   @ObfuscatedName("wn")
   @ObfuscatedGetter(
      intValue = 443468111
   )
   @Export("archiveLoadersDone")
   static int archiveLoadersDone;
   @ObfuscatedName("vx")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("DBTableIndex_cache")
   static EvictingDualNodeHashTable DBTableIndex_cache;
   @ObfuscatedName("uz")
   static boolean[] field738;
   @ObfuscatedName("vt")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("DBTableMasterIndex_cache")
   static EvictingDualNodeHashTable DBTableMasterIndex_cache;
   @ObfuscatedName("vp")
   @ObfuscatedSignature(
      descriptor = "Lrb;"
   )
   @Export("platformInfoProvider")
   static PlatformInfoProvider platformInfoProvider;
   @ObfuscatedName("vz")
   @ObfuscatedSignature(
      descriptor = "Lpe;"
   )
   @Export("archive5")
   static class394 archive5;
   @ObfuscatedName("ur")
   static int[] field739;
   @ObfuscatedName("um")
   static int[] field680;
   @ObfuscatedName("ux")
   static int[] field741;
   @ObfuscatedName("up")
   static int[] field566;
   @ObfuscatedName("vr")
   @ObfuscatedSignature(
      descriptor = "[Lnd;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("un")
   static short field544;
   @ObfuscatedName("ud")
   static short field744;
   @ObfuscatedName("vg")
   static short field749;
   @ObfuscatedName("vd")
   static short field750;
   @ObfuscatedName("vh")
   static short field748;
   @ObfuscatedName("tf")
   @ObfuscatedGetter(
      intValue = -1797839359
   )
   @Export("currentTrackGroupId")
   static int currentTrackGroupId;
   @ObfuscatedName("vb")
   @ObfuscatedGetter(
      intValue = 858349147
   )
   @Export("viewportZoom")
   static int viewportZoom;
   @ObfuscatedName("vl")
   static short field747;
   @ObfuscatedName("vq")
   @ObfuscatedGetter(
      intValue = 83246885
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("we")
   @ObfuscatedGetter(
      intValue = 280209169
   )
   static int field715;
   @ObfuscatedName("vm")
   @ObfuscatedGetter(
      intValue = 133193101
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("ut")
   @Export("zoomHeight")
   static short zoomHeight;
   @ObfuscatedName("ui")
   @Export("zoomWidth")
   static short zoomWidth;
   @ObfuscatedName("vw")
   @ObfuscatedSignature(
      descriptor = "Lck;"
   )
   @Export("GrandExchangeEvents_worldComparator")
   static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
   @ObfuscatedName("wf")
   @ObfuscatedGetter(
      intValue = 1754062913
   )
   static int field765;
   @ObfuscatedName("wl")
   static List field745;
   @ObfuscatedName("bf")
   static boolean field480 = true;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 1239493743
   )
   @Export("worldId")
   public static int worldId = 1;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 704671857
   )
   @Export("worldProperties")
   static int worldProperties = 0;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = -160706203
   )
   @Export("gameBuild")
   static int gameBuild = 0;
   @ObfuscatedName("cj")
   @Export("isMembersWorld")
   public static boolean isMembersWorld = false;
   @ObfuscatedName("cn")
   @Export("isLowDetail")
   static boolean isLowDetail = false;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = -1882712249
   )
   static int field486 = -1;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 1597109709
   )
   @Export("clientType")
   static int clientType = -1;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 86585189
   )
   static int field488 = -1;
   @ObfuscatedName("cg")
   @Export("onMobile")
   static boolean onMobile = false;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -1643853917
   )
   static int field557 = 212;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = -2124451829
   )
   @Export("gameState")
   static int gameState = 0;
   @ObfuscatedName("dn")
   @Export("isLoading")
   static boolean isLoading = true;
   @ObfuscatedName("di")
   @ObfuscatedGetter(
      intValue = 1940108065
   )
   @Export("cycle")
   static int cycle = 0;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      longValue = -8798868725760291405L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis = 1L;
   @ObfuscatedName("ee")
   @ObfuscatedGetter(
      intValue = 1324416435
   )
   static int field515 = -1;
   @ObfuscatedName("ex")
   @ObfuscatedGetter(
      intValue = -1774993997
   )
   static int field496 = -1;
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      longValue = -7563188290475486249L
   )
   static long field497 = -1L;
   @ObfuscatedName("eb")
   @Export("hadFocus")
   static boolean hadFocus = true;
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = -1010329251
   )
   @Export("rebootTimer")
   static int rebootTimer = 0;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = 1601373129
   )
   @Export("hintArrowType")
   static int hintArrowType = 0;
   @ObfuscatedName("ev")
   @ObfuscatedGetter(
      intValue = 582875797
   )
   @Export("hintArrowNpcIndex")
   static int hintArrowNpcIndex = 0;
   @ObfuscatedName("ef")
   @ObfuscatedGetter(
      intValue = -1164164871
   )
   @Export("hintArrowPlayerIndex")
   static int hintArrowPlayerIndex = 0;
   @ObfuscatedName("et")
   @ObfuscatedGetter(
      intValue = 999832987
   )
   @Export("hintArrowX")
   static int hintArrowX = 0;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = -101508831
   )
   @Export("hintArrowY")
   static int hintArrowY = 0;
   @ObfuscatedName("ec")
   @ObfuscatedGetter(
      intValue = 526038926
   )
   @Export("hintArrowHeight")
   static int hintArrowHeight = 0;
   @ObfuscatedName("eg")
   @ObfuscatedGetter(
      intValue = -269444357
   )
   @Export("hintArrowSubX")
   static int hintArrowSubX = 0;
   @ObfuscatedName("es")
   @ObfuscatedGetter(
      intValue = 220470720
   )
   @Export("hintArrowSubY")
   static int hintArrowSubY = 0;
   @ObfuscatedName("em")
   @ObfuscatedSignature(
      descriptor = "Ldy;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      descriptor = "Ldy;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("fz")
   @ObfuscatedGetter(
      intValue = -784948615
   )
   @Export("titleLoadingStage")
   static int titleLoadingStage;
   @ObfuscatedName("fe")
   @ObfuscatedGetter(
      intValue = 1611983557
   )
   @Export("js5ConnectState")
   static int js5ConnectState;
   @ObfuscatedName("fl")
   @ObfuscatedGetter(
      intValue = -1726871617
   )
   static int field512;
   @ObfuscatedName("gk")
   @ObfuscatedGetter(
      intValue = -1567330501
   )
   @Export("js5Errors")
   static int js5Errors;
   @ObfuscatedName("go")
   @ObfuscatedGetter(
      intValue = 1806142215
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("gn")
   @ObfuscatedGetter(
      intValue = -1056649217
   )
   static int field549;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -1530752341
   )
   static int field516;
   @ObfuscatedName("gz")
   @ObfuscatedGetter(
      intValue = 2117126047
   )
   static int field487;
   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      descriptor = "Lft;"
   )
   static class136 field518;
   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   static class482 field519;
   @ObfuscatedName("hv")
   static final String field499;
   @ObfuscatedName("hq")
   @Export("Login_isUsernameRemembered")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      descriptor = "Lcf;"
   )
   @Export("secureRandomFuture")
   static SecureRandomFuture secureRandomFuture;
   @ObfuscatedName("hz")
   @Export("randomDatData")
   static byte[] randomDatData;
   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "[Ldz;"
   )
   @Export("npcs")
   static NPC[] npcs;
   @ObfuscatedName("ip")
   @ObfuscatedGetter(
      intValue = 1679964095
   )
   @Export("npcCount")
   static int npcCount;
   @ObfuscatedName("is")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("im")
   @ObfuscatedGetter(
      intValue = -812139027
   )
   static int field539;
   @ObfuscatedName("ij")
   static int[] field662;
   @ObfuscatedName("ii")
   @ObfuscatedSignature(
      descriptor = "Lep;"
   )
   @Export("packetWriter")
   public static final PacketWriter packetWriter;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = -2063226693
   )
   @Export("logoutTimer")
   static int logoutTimer;
   @ObfuscatedName("ih")
   @Export("hadNetworkError")
   static boolean hadNetworkError;
   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      descriptor = "Los;"
   )
   @Export("timer")
   static Timer timer;
   @ObfuscatedName("iw")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("it")
   @Export("selectedItemName")
   static String selectedItemName;
   @ObfuscatedName("jc")
   @ObfuscatedGetter(
      intValue = -1806595179
   )
   static int field627;
   @ObfuscatedName("jp")
   @ObfuscatedGetter(
      intValue = 2078178879
   )
   static int field479;
   @ObfuscatedName("jg")
   @ObfuscatedGetter(
      intValue = 1551575329
   )
   static int field548;
   @ObfuscatedName("jm")
   @ObfuscatedGetter(
      intValue = -1458258409
   )
   static int field775;
   @ObfuscatedName("jo")
   @ObfuscatedGetter(
      intValue = 46285923
   )
   static int field501;
   @ObfuscatedName("je")
   @ObfuscatedSignature(
      descriptor = "[Liz;"
   )
   @Export("collisionMaps")
   static CollisionMap[] collisionMaps;
   @ObfuscatedName("jq")
   @Export("isInInstance")
   static boolean isInInstance;
   @ObfuscatedName("jh")
   @Export("instanceChunkTemplates")
   static int[][][] instanceChunkTemplates;
   @ObfuscatedName("jy")
   static final int[] field554;
   @ObfuscatedName("js")
   @ObfuscatedGetter(
      intValue = 888042879
   )
   @Export("graphicsCycle")
   static int graphicsCycle;
   @ObfuscatedName("km")
   @ObfuscatedGetter(
      intValue = -465899253
   )
   static int field556;
   @ObfuscatedName("kn")
   @ObfuscatedGetter(
      intValue = 964912341
   )
   static int field555;
   @ObfuscatedName("kh")
   @ObfuscatedGetter(
      intValue = 887107107
   )
   static int field558;
   @ObfuscatedName("kf")
   @ObfuscatedGetter(
      intValue = 1243290591
   )
   static int field559;
   @ObfuscatedName("kw")
   static boolean field560;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = -1791444461
   )
   @Export("alternativeScrollbarWidth")
   static int alternativeScrollbarWidth;
   @ObfuscatedName("ks")
   @ObfuscatedGetter(
      intValue = 1394082153
   )
   @Export("camAngleX")
   static int camAngleX;
   @ObfuscatedName("kq")
   @ObfuscatedGetter(
      intValue = 1027452777
   )
   @Export("camAngleY")
   static int camAngleY;
   @ObfuscatedName("kv")
   @ObfuscatedGetter(
      intValue = -829530353
   )
   @Export("camAngleDY")
   static int camAngleDY;
   @ObfuscatedName("kl")
   @ObfuscatedGetter(
      intValue = -1287210405
   )
   @Export("camAngleDX")
   static int camAngleDX;
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = 719527801
   )
   static int field691;
   @ObfuscatedName("kz")
   @ObfuscatedGetter(
      intValue = 1381924855
   )
   @Export("mouseCamClickedY")
   static int mouseCamClickedY;
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = 819645621
   )
   @Export("oculusOrbState")
   static int oculusOrbState;
   @ObfuscatedName("ke")
   @ObfuscatedGetter(
      intValue = -804166653
   )
   @Export("camFollowHeight")
   static int camFollowHeight;
   @ObfuscatedName("lg")
   @ObfuscatedGetter(
      intValue = -1672453785
   )
   static int field570;
   @ObfuscatedName("lr")
   @ObfuscatedGetter(
      intValue = 1785909097
   )
   static int field740;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 776539313
   )
   static int field599;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = 1001880197
   )
   @Export("oculusOrbNormalSpeed")
   static int oculusOrbNormalSpeed;
   @ObfuscatedName("lz")
   @ObfuscatedGetter(
      intValue = -711638791
   )
   @Export("oculusOrbSlowedSpeed")
   static int oculusOrbSlowedSpeed;
   @ObfuscatedName("lm")
   @ObfuscatedGetter(
      intValue = -1978635877
   )
   static int field575;
   @ObfuscatedName("lb")
   static boolean field553;
   @ObfuscatedName("ld")
   @ObfuscatedGetter(
      intValue = -1625953571
   )
   static int field577;
   @ObfuscatedName("lh")
   static boolean field578;
   @ObfuscatedName("lp")
   @ObfuscatedGetter(
      intValue = 1213218601
   )
   static int field500;
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = 2020862949
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("lx")
   @ObfuscatedGetter(
      intValue = 1270165343
   )
   @Export("overheadTextLimit")
   static int overheadTextLimit;
   @ObfuscatedName("li")
   @Export("overheadTextXs")
   static int[] overheadTextXs;
   @ObfuscatedName("lt")
   @Export("overheadTextYs")
   static int[] overheadTextYs;
   @ObfuscatedName("ll")
   @Export("overheadTextAscents")
   static int[] overheadTextAscents;
   @ObfuscatedName("le")
   @Export("overheadTextXOffsets")
   static int[] overheadTextXOffsets;
   @ObfuscatedName("lu")
   @Export("overheadTextColors")
   static int[] overheadTextColors;
   @ObfuscatedName("ls")
   @Export("overheadTextEffects")
   static int[] overheadTextEffects;
   @ObfuscatedName("la")
   @Export("overheadTextCyclesRemaining")
   static int[] overheadTextCyclesRemaining;
   @ObfuscatedName("lc")
   @Export("overheadText")
   static String[] overheadText;
   @ObfuscatedName("lo")
   @Export("tileLastDrawnActor")
   static int[][] tileLastDrawnActor;
   @ObfuscatedName("ly")
   @ObfuscatedGetter(
      intValue = -209298997
   )
   @Export("viewportDrawCount")
   static int viewportDrawCount;
   @ObfuscatedName("my")
   @ObfuscatedGetter(
      intValue = 709631145
   )
   @Export("viewportTempX")
   static int viewportTempX;
   @ObfuscatedName("ma")
   @ObfuscatedGetter(
      intValue = 50695989
   )
   @Export("viewportTempY")
   static int viewportTempY;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      intValue = -1594351991
   )
   @Export("mouseCrossX")
   static int mouseCrossX;
   @ObfuscatedName("mw")
   @ObfuscatedGetter(
      intValue = -1933203361
   )
   @Export("mouseCrossY")
   static int mouseCrossY;
   @ObfuscatedName("mh")
   @ObfuscatedGetter(
      intValue = 2026603892
   )
   @Export("mouseCrossState")
   static int mouseCrossState;
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = -1435919357
   )
   @Export("mouseCrossColor")
   static int mouseCrossColor;
   @ObfuscatedName("mo")
   @Export("showMouseCross")
   static boolean showMouseCross;
   @ObfuscatedName("mi")
   @ObfuscatedGetter(
      intValue = -83285091
   )
   static int field667;
   @ObfuscatedName("ms")
   @Export("showLoadingMessages")
   static boolean showLoadingMessages;
   @ObfuscatedName("mb")
   @ObfuscatedSignature(
      descriptor = "[Ldh;"
   )
   @Export("players")
   static Player[] players;
   @ObfuscatedName("mj")
   @ObfuscatedGetter(
      intValue = 1045966863
   )
   @Export("localPlayerIndex")
   static int localPlayerIndex;
   @ObfuscatedName("mr")
   @ObfuscatedGetter(
      intValue = -320174999
   )
   static int field603;
   @ObfuscatedName("mf")
   @ObfuscatedGetter(
      longValue = 3740577499301829319L
   )
   static long field671;
   @ObfuscatedName("mc")
   @Export("renderSelf")
   static boolean renderSelf;
   @ObfuscatedName("mn")
   @ObfuscatedGetter(
      intValue = 1859570443
   )
   @Export("drawPlayerNames")
   static int drawPlayerNames;
   @ObfuscatedName("mk")
   @ObfuscatedGetter(
      intValue = -354872623
   )
   static int field607;
   @ObfuscatedName("mp")
   static int[] field608;
   @ObfuscatedName("ns")
   @Export("playerMenuOpcodes")
   static final int[] playerMenuOpcodes;
   @ObfuscatedName("ne")
   @Export("playerMenuActions")
   static String[] playerMenuActions;
   @ObfuscatedName("nk")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("nz")
   @Export("defaultRotations")
   static int[] defaultRotations;
   @ObfuscatedName("ng")
   @ObfuscatedGetter(
      intValue = -781597715
   )
   @Export("combatTargetPlayerIndex")
   static int combatTargetPlayerIndex;
   @ObfuscatedName("nr")
   @ObfuscatedSignature(
      descriptor = "[[[Lnj;"
   )
   @Export("groundItems")
   static NodeDeque[][][] groundItems;
   @ObfuscatedName("nf")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("pendingSpawns")
   static NodeDeque pendingSpawns;
   @ObfuscatedName("na")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("projectiles")
   static NodeDeque projectiles;
   @ObfuscatedName("nw")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("graphicsObjects")
   static NodeDeque graphicsObjects;
   @ObfuscatedName("nv")
   @Export("currentLevels")
   static int[] currentLevels;
   @ObfuscatedName("nd")
   @Export("levels")
   static int[] levels;
   @ObfuscatedName("no")
   @Export("experience")
   static int[] experience;
   @ObfuscatedName("nb")
   @Export("leftClickOpensMenu")
   static boolean leftClickOpensMenu;
   @ObfuscatedName("nu")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -638635143
   )
   @Export("menuOptionsCount")
   static int menuOptionsCount;
   @ObfuscatedName("nj")
   @Export("menuArguments1")
   static int[] menuArguments1;
   @ObfuscatedName("nc")
   @Export("menuArguments2")
   static int[] menuArguments2;
   @ObfuscatedName("ni")
   @Export("menuOpcodes")
   static int[] menuOpcodes;
   @ObfuscatedName("ny")
   @Export("menuIdentifiers")
   static int[] menuIdentifiers;
   @ObfuscatedName("nn")
   @Export("menuItemIds")
   static int[] menuItemIds;
   @ObfuscatedName("nh")
   @Export("menuActions")
   static String[] menuActions;
   @ObfuscatedName("om")
   @Export("menuTargets")
   static String[] menuTargets;
   @ObfuscatedName("oa")
   @Export("menuShiftClick")
   static boolean[] menuShiftClick;
   @ObfuscatedName("ok")
   @Export("followerOpsLowPriority")
   static boolean followerOpsLowPriority;
   @ObfuscatedName("ov")
   @Export("tapToDrop")
   static boolean tapToDrop;
   @ObfuscatedName("og")
   @Export("showMouseOverText")
   static boolean showMouseOverText;
   @ObfuscatedName("oh")
   @ObfuscatedGetter(
      intValue = -203153139
   )
   @Export("viewportX")
   static int viewportX;
   @ObfuscatedName("ob")
   @ObfuscatedGetter(
      intValue = -582123169
   )
   @Export("viewportY")
   static int viewportY;
   @ObfuscatedName("ow")
   @ObfuscatedGetter(
      intValue = 1543695569
   )
   static int field536;
   @ObfuscatedName("oj")
   @ObfuscatedGetter(
      intValue = -1106497607
   )
   static int field550;
   @ObfuscatedName("od")
   @ObfuscatedGetter(
      intValue = 1216314019
   )
   @Export("isItemSelected")
   static int isItemSelected;
   @ObfuscatedName("on")
   @Export("isSpellSelected")
   static boolean isSpellSelected;
   @ObfuscatedName("oc")
   @ObfuscatedGetter(
      intValue = -434988193
   )
   @Export("selectedSpellChildIndex")
   static int selectedSpellChildIndex;
   @ObfuscatedName("ot")
   @ObfuscatedGetter(
      intValue = 829764683
   )
   @Export("selectedSpellItemId")
   static int selectedSpellItemId;
   @ObfuscatedName("os")
   @Export("selectedSpellActionName")
   static String selectedSpellActionName;
   @ObfuscatedName("ox")
   @Export("selectedSpellName")
   static String selectedSpellName;
   @ObfuscatedName("oo")
   @ObfuscatedGetter(
      intValue = -1481437049
   )
   @Export("rootInterface")
   static int rootInterface;
   @ObfuscatedName("of")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("interfaceParents")
   static NodeHashTable interfaceParents;
   @ObfuscatedName("pm")
   @ObfuscatedGetter(
      intValue = 281694929
   )
   static int field648;
   @ObfuscatedName("ps")
   @ObfuscatedGetter(
      intValue = 1342292641
   )
   static int field763;
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = 360881141
   )
   @Export("chatEffects")
   static int chatEffects;
   @ObfuscatedName("pn")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("meslayerContinueWidget")
   static Widget meslayerContinueWidget;
   @ObfuscatedName("pq")
   @ObfuscatedGetter(
      intValue = 633577609
   )
   @Export("runEnergy")
   static int runEnergy;
   @ObfuscatedName("pd")
   @ObfuscatedGetter(
      intValue = 1614327295
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("py")
   @ObfuscatedGetter(
      intValue = 863173745
   )
   @Export("staffModLevel")
   static int staffModLevel;
   @ObfuscatedName("pa")
   @ObfuscatedGetter(
      intValue = 1037229811
   )
   @Export("followerIndex")
   static int followerIndex;
   @ObfuscatedName("pk")
   @Export("playerMod")
   static boolean playerMod;
   @ObfuscatedName("pz")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("viewportWidget")
   static Widget viewportWidget;
   @ObfuscatedName("po")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("clickedWidget")
   static Widget clickedWidget;
   @ObfuscatedName("pb")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("clickedWidgetParent")
   static Widget clickedWidgetParent;
   @ObfuscatedName("pl")
   @ObfuscatedGetter(
      intValue = -1658137385
   )
   @Export("widgetClickX")
   static int widgetClickX;
   @ObfuscatedName("ph")
   @ObfuscatedGetter(
      intValue = -1525842885
   )
   @Export("widgetClickY")
   static int widgetClickY;
   @ObfuscatedName("pc")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("pt")
   static boolean field663;
   @ObfuscatedName("pf")
   @ObfuscatedGetter(
      intValue = 1602569321
   )
   static int field664;
   @ObfuscatedName("pj")
   @ObfuscatedGetter(
      intValue = 1694095059
   )
   static int field597;
   @ObfuscatedName("pr")
   static boolean field771;
   @ObfuscatedName("px")
   @ObfuscatedGetter(
      intValue = 1838487771
   )
   static int field572;
   @ObfuscatedName("pg")
   @ObfuscatedGetter(
      intValue = 48842723
   )
   static int field668;
   @ObfuscatedName("pv")
   @Export("isDraggingWidget")
   static boolean isDraggingWidget;
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      intValue = 495285343
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("qt")
   @Export("changedVarps")
   static int[] changedVarps;
   @ObfuscatedName("qx")
   @ObfuscatedGetter(
      intValue = 851598891
   )
   @Export("changedVarpCount")
   static int changedVarpCount;
   @ObfuscatedName("qo")
   @Export("changedItemContainers")
   static int[] changedItemContainers;
   @ObfuscatedName("qs")
   @ObfuscatedGetter(
      intValue = 257135263
   )
   static int field666;
   @ObfuscatedName("qv")
   @Export("changedSkills")
   static int[] changedSkills;
   @ObfuscatedName("ql")
   @ObfuscatedGetter(
      intValue = -1272683167
   )
   @Export("changedSkillsCount")
   static int changedSkillsCount;
   @ObfuscatedName("qf")
   static int[] field677;
   @ObfuscatedName("qd")
   @ObfuscatedGetter(
      intValue = 212048049
   )
   static int field678;
   @ObfuscatedName("qq")
   @ObfuscatedGetter(
      intValue = 274438877
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("qw")
   @ObfuscatedGetter(
      intValue = 237918075
   )
   static int field701;
   @ObfuscatedName("qn")
   @ObfuscatedGetter(
      intValue = 1649389357
   )
   static int field525;
   @ObfuscatedName("qb")
   @ObfuscatedGetter(
      intValue = 2026078347
   )
   static int field682;
   @ObfuscatedName("qg")
   @ObfuscatedGetter(
      intValue = -731591385
   )
   static int field482;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = 759595907
   )
   static int field643;
   @ObfuscatedName("qr")
   @ObfuscatedGetter(
      intValue = -1829225
   )
   static int field685;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = 1247791327
   )
   static int field686;
   @ObfuscatedName("rx")
   @ObfuscatedGetter(
      intValue = -818502501
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("ru")
   @ObfuscatedSignature(
      descriptor = "Ltl;"
   )
   static class495 field688;
   @ObfuscatedName("ra")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   @Export("scriptEvents")
   static NodeDeque scriptEvents;
   @ObfuscatedName("rt")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   static NodeDeque field690;
   @ObfuscatedName("rb")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   static NodeDeque field529;
   @ObfuscatedName("rk")
   @ObfuscatedSignature(
      descriptor = "Lnj;"
   )
   static NodeDeque field692;
   @ObfuscatedName("rc")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("widgetFlags")
   static NodeHashTable widgetFlags;
   @ObfuscatedName("ry")
   @ObfuscatedGetter(
      intValue = -1159416189
   )
   @Export("rootWidgetCount")
   static int rootWidgetCount;
   @ObfuscatedName("rv")
   @ObfuscatedGetter(
      intValue = 707915123
   )
   static int field695;
   @ObfuscatedName("rp")
   static boolean[] field722;
   @ObfuscatedName("rz")
   static boolean[] field697;
   @ObfuscatedName("rh")
   static boolean[] field698;
   @ObfuscatedName("ri")
   @Export("rootWidgetXs")
   static int[] rootWidgetXs;
   @ObfuscatedName("rn")
   @Export("rootWidgetYs")
   static int[] rootWidgetYs;
   @ObfuscatedName("rm")
   @Export("rootWidgetWidths")
   static int[] rootWidgetWidths;
   @ObfuscatedName("rl")
   @Export("rootWidgetHeights")
   static int[] rootWidgetHeights;
   @ObfuscatedName("re")
   @ObfuscatedGetter(
      intValue = -762937085
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("rq")
   @ObfuscatedGetter(
      longValue = -534961974875285193L
   )
   static long field696;
   @ObfuscatedName("rr")
   @Export("isResizable")
   static boolean isResizable;
   @ObfuscatedName("sd")
   static int[] field706;
   @ObfuscatedName("sv")
   @ObfuscatedGetter(
      intValue = -1103514873
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("st")
   @ObfuscatedGetter(
      intValue = 87475353
   )
   @Export("tradeChatMode")
   static int tradeChatMode;
   @ObfuscatedName("sh")
   static String field637;
   @ObfuscatedName("si")
   @Export("crossWorldMessageIds")
   static long[] crossWorldMessageIds;
   @ObfuscatedName("se")
   @ObfuscatedGetter(
      intValue = -2087955713
   )
   @Export("crossWorldMessageIdsIndex")
   static int crossWorldMessageIdsIndex;
   @ObfuscatedName("sq")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   static class208 field712;
   @ObfuscatedName("sy")
   @ObfuscatedSignature(
      descriptor = "Lhi;"
   )
   static class206 field713;
   @ObfuscatedName("ss")
   @ObfuscatedGetter(
      intValue = -1814462933
   )
   static int field714;
   @ObfuscatedName("sw")
   static int[] field641;
   @ObfuscatedName("so")
   static int[] field716;
   @ObfuscatedName("sg")
   @ObfuscatedGetter(
      longValue = -8710460316201288843L
   )
   static long field622;
   @ObfuscatedName("sj")
   @ObfuscatedSignature(
      descriptor = "[Lfi;"
   )
   @Export("currentClanSettings")
   static ClanSettings[] currentClanSettings;
   @ObfuscatedName("sm")
   @ObfuscatedSignature(
      descriptor = "[Lgn;"
   )
   @Export("currentClanChannels")
   static ClanChannel[] currentClanChannels;
   @ObfuscatedName("sp")
   @ObfuscatedGetter(
      intValue = -1042588199
   )
   static int field720;
   @ObfuscatedName("sn")
   @ObfuscatedGetter(
      intValue = -1011636969
   )
   @Export("mapIconCount")
   static int mapIconCount;
   @ObfuscatedName("sa")
   @Export("mapIconXs")
   static int[] mapIconXs;
   @ObfuscatedName("sr")
   @Export("mapIconYs")
   static int[] mapIconYs;
   @ObfuscatedName("tk")
   @ObfuscatedSignature(
      descriptor = "[Lsn;"
   )
   @Export("mapIcons")
   static SpritePixels[] mapIcons;
   @ObfuscatedName("tl")
   @ObfuscatedGetter(
      intValue = 1681066915
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("tg")
   @ObfuscatedGetter(
      intValue = 1663774571
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("tw")
   @ObfuscatedGetter(
      intValue = -178662269
   )
   @Export("minimapState")
   static int minimapState;
   @ObfuscatedName("gf")
   String field520;
   @ObfuscatedName("gp")
   @ObfuscatedSignature(
      descriptor = "Lam;"
   )
   class14 field521;
   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "Lag;"
   )
   class18 field522;
   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
   )
   OtlTokenRequester field523;
   @ObfuscatedName("gt")
   Future field524;
   @ObfuscatedName("hb")
   boolean field606 = false;
   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      descriptor = "Lag;"
   )
   class18 field526;
   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
   )
   RefreshAccessTokenRequester field527;
   @ObfuscatedName("hr")
   Future field551;
   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      descriptor = "Lsy;"
   )
   Buffer field634;
   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      descriptor = "Laq;"
   )
   class7 field658;
   @ObfuscatedName("hh")
   @ObfuscatedGetter(
      longValue = -1510702780732422111L
   )
   long field534 = -1L;

   static {
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      titleLoadingStage = 0;
      js5ConnectState = 0;
      field512 = 0;
      js5Errors = 0;
      loginState = 0;
      field549 = 0;
      field516 = 0;
      field487 = 0;
      field518 = class136.field1595;
      field519 = class482.field4962;
      int var1 = "com_jagex_auth_desktop_osrs:public".length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
         if (var4 > 127) {
            var2[var3] = 63;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      field499 = GrandExchangeEvents.method6539(var2);
      Login_isUsernameRemembered = false;
      secureRandomFuture = new SecureRandomFuture();
      randomDatData = null;
      npcs = new NPC[65536];
      npcCount = 0;
      npcIndices = new int[65536];
      field539 = 0;
      field662 = new int[250];
      packetWriter = new PacketWriter();
      logoutTimer = 0;
      hadNetworkError = false;
      timer = new Timer();
      fontsMap = new HashMap();
      field627 = 0;
      field479 = 1;
      field548 = 0;
      field775 = 1;
      field501 = 0;
      collisionMaps = new CollisionMap[4];
      isInInstance = false;
      instanceChunkTemplates = new int[4][13][13];
      field554 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      graphicsCycle = 0;
      field556 = 2301979;
      field555 = 5063219;
      field558 = 3353893;
      field559 = 7759444;
      field560 = false;
      alternativeScrollbarWidth = 0;
      camAngleX = 128;
      camAngleY = 0;
      camAngleDY = 0;
      camAngleDX = 0;
      field691 = 0;
      mouseCamClickedY = 0;
      oculusOrbState = 0;
      camFollowHeight = 50;
      field570 = 0;
      field740 = 0;
      field599 = 0;
      oculusOrbNormalSpeed = 12;
      oculusOrbSlowedSpeed = 6;
      field575 = 0;
      field553 = false;
      field577 = 0;
      field578 = false;
      field500 = 0;
      overheadTextCount = 0;
      overheadTextLimit = 50;
      overheadTextXs = new int[overheadTextLimit];
      overheadTextYs = new int[overheadTextLimit];
      overheadTextAscents = new int[overheadTextLimit];
      overheadTextXOffsets = new int[overheadTextLimit];
      overheadTextColors = new int[overheadTextLimit];
      overheadTextEffects = new int[overheadTextLimit];
      overheadTextCyclesRemaining = new int[overheadTextLimit];
      overheadText = new String[overheadTextLimit];
      tileLastDrawnActor = new int[104][104];
      viewportDrawCount = 0;
      viewportTempX = -1;
      viewportTempY = -1;
      mouseCrossX = 0;
      mouseCrossY = 0;
      mouseCrossState = 0;
      mouseCrossColor = 0;
      showMouseCross = true;
      field667 = 0;
      showLoadingMessages = true;
      players = new Player[2048];
      localPlayerIndex = -1;
      field603 = 0;
      field671 = -1L;
      renderSelf = true;
      drawPlayerNames = 0;
      field607 = 0;
      field608 = new int[1000];
      playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerMenuActions = new String[8];
      playerOptionsPriorities = new boolean[8];
      defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      combatTargetPlayerIndex = -1;
      groundItems = new NodeDeque[4][104][104];
      pendingSpawns = new NodeDeque();
      projectiles = new NodeDeque();
      graphicsObjects = new NodeDeque();
      currentLevels = new int[25];
      levels = new int[25];
      experience = new int[25];
      leftClickOpensMenu = false;
      isMenuOpen = false;
      menuOptionsCount = 0;
      menuArguments1 = new int[500];
      menuArguments2 = new int[500];
      menuOpcodes = new int[500];
      menuIdentifiers = new int[500];
      menuItemIds = new int[500];
      menuActions = new String[500];
      menuTargets = new String[500];
      menuShiftClick = new boolean[500];
      followerOpsLowPriority = false;
      tapToDrop = false;
      showMouseOverText = true;
      viewportX = -1;
      viewportY = -1;
      field536 = 0;
      field550 = 50;
      isItemSelected = 0;
      selectedItemName = null;
      isSpellSelected = false;
      selectedSpellChildIndex = -1;
      selectedSpellItemId = -1;
      selectedSpellActionName = null;
      selectedSpellName = null;
      rootInterface = -1;
      interfaceParents = new NodeHashTable(8);
      field648 = 0;
      field763 = -1;
      chatEffects = 0;
      meslayerContinueWidget = null;
      runEnergy = 0;
      weight = 0;
      staffModLevel = 0;
      followerIndex = -1;
      playerMod = false;
      viewportWidget = null;
      clickedWidget = null;
      clickedWidgetParent = null;
      widgetClickX = 0;
      widgetClickY = 0;
      draggedOnWidget = null;
      field663 = false;
      field664 = -1;
      field597 = -1;
      field771 = false;
      field572 = -1;
      field668 = -1;
      isDraggingWidget = false;
      cycleCntr = 1;
      changedVarps = new int[32];
      changedVarpCount = 0;
      changedItemContainers = new int[32];
      field666 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      field677 = new int[32];
      field678 = 0;
      chatCycle = 0;
      field701 = 0;
      field525 = 0;
      field682 = 0;
      field482 = 0;
      field643 = 0;
      field685 = 0;
      field686 = 0;
      mouseWheelRotation = 0;
      field688 = new class495();
      scriptEvents = new NodeDeque();
      field690 = new NodeDeque();
      field529 = new NodeDeque();
      field692 = new NodeDeque();
      widgetFlags = new NodeHashTable(512);
      rootWidgetCount = 0;
      field695 = -2;
      field722 = new boolean[100];
      field697 = new boolean[100];
      field698 = new boolean[100];
      rootWidgetXs = new int[100];
      rootWidgetYs = new int[100];
      rootWidgetWidths = new int[100];
      rootWidgetHeights = new int[100];
      gameDrawingMode = 0;
      field696 = 0L;
      isResizable = true;
      field706 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      tradeChatMode = 0;
      field637 = "";
      crossWorldMessageIds = new long[100];
      crossWorldMessageIdsIndex = 0;
      field712 = new class208();
      field713 = new class206();
      field714 = 0;
      field641 = new int[128];
      field716 = new int[128];
      field622 = -1L;
      currentClanSettings = new ClanSettings[4];
      currentClanChannels = new ClanChannel[4];
      field720 = -1;
      mapIconCount = 0;
      mapIconXs = new int[1000];
      mapIconYs = new int[1000];
      mapIcons = new SpritePixels[1000];
      destinationX = 0;
      destinationY = 0;
      minimapState = 0;
      currentTrackGroupId = -1;
      playingJingle = false;
      soundEffectCount = 0;
      soundEffectIds = new int[50];
      queuedSoundEffectLoops = new int[50];
      queuedSoundEffectDelays = new int[50];
      soundLocations = new int[50];
      soundEffects = new SoundEffect[50];
      isCameraLocked = false;
      field737 = false;
      field738 = new boolean[5];
      field739 = new int[5];
      field680 = new int[5];
      field741 = new int[5];
      field566 = new int[5];
      field544 = 256;
      field744 = 205;
      zoomHeight = 256;
      zoomWidth = 320;
      field747 = 1;
      field748 = 32767;
      field749 = 1;
      field750 = 32767;
      viewportOffsetX = 0;
      viewportOffsetY = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      viewportZoom = 0;
      playerAppearance = new PlayerComposition();
      field756 = -1;
      field718 = -1;
      platformInfoProvider = new DesktopPlatformInfoProvider();
      grandExchangeOffers = new GrandExchangeOffer[8];
      GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
      archive5 = new class394(8, class392.field4475);
      DBTableIndex_cache = new EvictingDualNodeHashTable(64);
      DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
      field765 = -1;
      field574 = -1;
      field745 = new ArrayList();
      archiveLoaders = new ArrayList(10);
      archiveLoadersDone = 0;
      field715 = 0;
      field571 = new ApproximateRouteStrategy();
      field542 = new int[50];
      field773 = new int[50];
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1315269031"
   )
   @Export("resizeGame")
   protected final void resizeGame() {
      field696 = WorldMapSection2.method4844() + 500L;
      this.resizeJS();
      if (rootInterface != -1) {
         this.resizeRoot(true);
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1812622075"
   )
   @Export("setUp")
   protected final void setUp() {
      int[] var1 = new int[]{20, 260, 10000};
      int[] var2 = new int[]{1000, 100, 500};
      if (var1 != null && var2 != null) {
         class212.ByteArrayPool_alternativeSizes = var1;
         SoundSystem.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
         InterfaceParent.ByteArrayPool_arrays = new byte[var1.length][][];

         for(int var3 = 0; var3 < class212.ByteArrayPool_alternativeSizes.length; ++var3) {
            InterfaceParent.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
            ByteArrayPool.field4424.add(var1[var3]);
         }

         Collections.sort(ByteArrayPool.field4424);
      } else {
         class212.ByteArrayPool_alternativeSizes = null;
         SoundSystem.ByteArrayPool_altSizeArrayCounts = null;
         InterfaceParent.ByteArrayPool_arrays = null;
         SpriteMask.method5743();
      }

      class290.worldPort = gameBuild == 0 ? 'ꩊ' : worldId + '鱀';
      Calendar.js5Port = gameBuild == 0 ? 443 : worldId + '썐';
      ClanSettings.currentPort = class290.worldPort;
      class308.field3457 = class311.field3505;
      CollisionMap.field2315 = class311.field3503;
      class128.field1529 = class311.field3507;
      class126.field1495 = class311.field3502;
      class345.urlRequester = new class110(this.field606, 212);
      this.setUpKeyboard();
      this.method486();
      class7.mouseWheel = this.mouseWheel();
      this.method476(field713, 0);
      this.method476(field712, 1);
      MidiPcmStream.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
      AccessFile var4 = null;
      ClientPreferences var5 = new ClientPreferences();

      try {
         var4 = class350.getPreferencesFile("", DbTableType.field4870.name, false);
         byte[] var6 = new byte[(int)var4.length()];

         int var8;
         for(int var7 = 0; var7 < var6.length; var7 += var8) {
            var8 = var4.read(var6, var7, var6.length - var7);
            if (var8 == -1) {
               throw new IOException();
            }
         }

         var5 = new ClientPreferences(new Buffer(var6));
      } catch (Exception var11) {
      }

      try {
         if (var4 != null) {
            var4.close();
         }
      } catch (Exception var10) {
      }

      WorldMapSectionType.clientPreferences = var5;
      this.setUpClipboard();
      String var12 = UserComparator3.field1424;
      class31.field166 = this;
      if (var12 != null) {
         class31.field161 = var12;
      }

      NPC.setWindowedMode(WorldMapSectionType.clientPreferences.method2450());
      class6.friendSystem = new FriendSystem(Occluder.loginType);
      this.field521 = new class14("tokenRequest", 1, 1);
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "32"
   )
   @Export("doCycle")
   protected final void doCycle() {
      ++cycle;
      this.doCycleJs5();
      VerticalAlignment.method3716();

      int var1;
      try {
         if (class293.musicPlayerStatus == 1) {
            var1 = class293.midiPcmStream.method5526();
            if (var1 > 0 && class293.midiPcmStream.isReady()) {
               var1 -= AbstractRasterProvider.pcmSampleLength;
               if (var1 < 0) {
                  var1 = 0;
               }

               class293.midiPcmStream.setPcmStreamVolume(var1);
            } else {
               class293.midiPcmStream.clear();
               class293.midiPcmStream.removeAll();
               if (class364.musicTrackArchive != null) {
                  class293.musicPlayerStatus = 2;
               } else {
                  class293.musicPlayerStatus = 0;
               }

               BufferedNetSocket.musicTrack = null;
               class293.soundCache = null;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         class293.midiPcmStream.clear();
         class293.musicPlayerStatus = 0;
         BufferedNetSocket.musicTrack = null;
         class293.soundCache = null;
         class364.musicTrackArchive = null;
      }

      EnumComposition.playPcmPlayers();
      field712.method4085();
      this.method484();
      synchronized(MouseHandler.MouseHandler_instance) {
         MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
         MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
         MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
         MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
         MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
         MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
         MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
         MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
         MouseHandler.MouseHandler_lastButtonVolatile = 0;
      }

      if (class7.mouseWheel != null) {
         var1 = class7.mouseWheel.useRotation();
         mouseWheelRotation = var1;
      }

      if (gameState == 0) {
         GrandExchangeOfferOwnWorldComparator.load();
         Strings.method6352();
      } else if (gameState == 5) {
         class288.loginScreen(this, Calendar.fontPlain11, class420.fontPlain12);
         GrandExchangeOfferOwnWorldComparator.load();
         Strings.method6352();
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            class288.loginScreen(this, Calendar.fontPlain11, class420.fontPlain12);
            this.doCycleLoggedOut();
         } else if (gameState == 50) {
            class288.loginScreen(this, Calendar.fontPlain11, class420.fontPlain12);
            this.doCycleLoggedOut();
         } else if (gameState == 25) {
            SoundSystem.method834();
         }
      } else {
         class288.loginScreen(this, Calendar.fontPlain11, class420.fontPlain12);
      }

      if (gameState == 30) {
         this.doCycleLoggedIn();
      } else if (gameState == 40 || gameState == 45) {
         this.doCycleLoggedOut();
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "28303"
   )
   @Export("draw")
   protected final void draw(boolean var1) {
      boolean var2 = MusicPatchNode.method5737();
      if (var2 && playingJingle && Interpreter.pcmPlayer0 != null) {
         Interpreter.pcmPlayer0.tryDiscard();
      }

      if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field696 && WorldMapSection2.method4844() > field696) {
         NPC.setWindowedMode(class7.getWindowedMode());
      }

      int var3;
      if (var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field722[var3] = true;
         }
      }

      if (gameState == 0) {
         this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
      } else if (gameState == 5) {
         class141.drawTitle(class7.fontBold12, Calendar.fontPlain11, class420.fontPlain12);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            class141.drawTitle(class7.fontBold12, Calendar.fontPlain11, class420.fontPlain12);
         } else if (gameState == 50) {
            class141.drawTitle(class7.fontBold12, Calendar.fontPlain11, class420.fontPlain12);
         } else if (gameState == 25) {
            if (field501 == 1) {
               if (field627 > field479) {
                  field479 = field627;
               }

               var3 = (field479 * 50 - field627 * 50) / field479;
               class16.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else if (field501 == 2) {
               if (field548 > field775) {
                  field775 = field548;
               }

               var3 = (field775 * 50 - field548 * 50) / field775 + 50;
               class16.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else {
               class16.drawLoadingMessage("Loading - please wait.", false);
            }
         } else if (gameState == 30) {
            this.drawLoggedIn();
         } else if (gameState == 40) {
            class16.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (gameState == 45) {
            class16.drawLoadingMessage("Please wait...", false);
         }
      } else {
         class141.drawTitle(class7.fontBold12, Calendar.fontPlain11, class420.fontPlain12);
      }

      if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
         for(var3 = 0; var3 < rootWidgetCount; ++var3) {
            if (field697[var3]) {
               StudioGame.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
               field697[var3] = false;
            }
         }
      } else if (gameState > 0) {
         StudioGame.rasterProvider.drawFull(0, 0);

         for(var3 = 0; var3 < rootWidgetCount; ++var3) {
            field697[var3] = false;
         }
      }

   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-78"
   )
   @Export("kill0")
   protected final void kill0() {
      if (class248.varcs.hasUnwrittenChanges()) {
         class248.varcs.write();
      }

      if (class212.mouseRecorder != null) {
         class212.mouseRecorder.isRunning = false;
      }

      class212.mouseRecorder = null;
      packetWriter.close();
      if (MouseHandler.MouseHandler_instance != null) {
         synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_instance = null;
         }
      }

      class7.mouseWheel = null;
      if (Interpreter.pcmPlayer0 != null) {
         Interpreter.pcmPlayer0.shutdown();
      }

      if (ViewportMouse.pcmPlayer1 != null) {
         ViewportMouse.pcmPlayer1.shutdown();
      }

      if (NetCache.NetCache_socket != null) {
         NetCache.NetCache_socket.close();
      }

      TaskHandler.method3460();
      if (class345.urlRequester != null) {
         class345.urlRequester.close();
         class345.urlRequester = null;
      }

      class248.method5126();
      this.field521.method176();
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-87"
   )
   protected final void vmethod1617() {
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-16"
   )
   boolean method1222() {
      return class308.field3460 != null && !class308.field3460.trim().isEmpty() && class12.field63 != null && !class12.field63.trim().isEmpty();
   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1703203662"
   )
   boolean method1223() {
      return class90.field1120 != null && !class90.field1120.trim().isEmpty() && class433.field4642 != null && !class433.field4642.trim().isEmpty();
   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "25"
   )
   boolean method1507() {
      return this.field523 != null;
   }

   @ObfuscatedName("gk")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "3"
   )
   void method1225(String var1) throws IOException {
      HashMap var2 = new HashMap();
      var2.put("grant_type", "refresh_token");
      var2.put("scope", "gamesso.token.create");
      var2.put("refresh_token", var1);
      URL var3 = new URL(class211.field2334 + "shield/oauth/token" + (new class434(var2)).method7995());
      class390 var4 = new class390();
      var4.method7360(field499);
      var4.method7359("Host", (new URL(class211.field2334)).getHost());
      var4.method7364(class431.field4639);
      class9 var5 = class9.field37;
      RefreshAccessTokenRequester var6 = this.field527;
      if (var6 != null) {
         this.field551 = var6.request(var5.method63(), var3, var4.method7356(), "");
      } else {
         class10 var7 = new class10(var3, var5, var4, this.field606);
         this.field526 = this.field521.method165(var7);
      }
   }

   @ObfuscatedName("gb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "193540774"
   )
   void method1384(String var1) throws IOException {
      URL var2 = new URL(class211.field2334 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      class390 var3 = new class390();
      var3.method7357(var1);
      class9 var4 = class9.field33;
      OtlTokenRequester var5 = this.field523;
      if (var5 != null) {
         this.field524 = var5.request(var4.method63(), var2, var3.method7356(), "");
      } else {
         class10 var6 = new class10(var2, var4, var3, this.field606);
         this.field522 = this.field521.method165(var6);
      }
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-195209311"
   )
   void method1227(String var1, String var2) throws IOException, JSONException {
      URL var3 = new URL(class211.field2334 + "/game-session/v1/tokens");
      class10 var4 = new class10(var3, class9.field37, this.field606);
      var4.method78().method7357(var1);
      var4.method78().method7364(class431.field4639);
      JSONObject var5 = new JSONObject();
      var5.method8392("accountId", var2);
      var4.method79(new class433(var5));
      this.field522 = this.field521.method165(var4);
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1071068400"
   )
   @Export("doCycleJs5")
   void doCycleJs5() {
      if (gameState != 1000) {
         long var2 = WorldMapSection2.method4844();
         int var4 = (int)(var2 - NetCache.field4204);
         NetCache.field4204 = var2;
         if (var4 > 200) {
            var4 = 200;
         }

         NetCache.NetCache_loadTime += var4;
         boolean var1;
         if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
            var1 = true;
         } else if (NetCache.NetCache_socket == null) {
            var1 = false;
         } else {
            try {
               label250: {
                  if (NetCache.NetCache_loadTime > 30000) {
                     throw new IOException();
                  }

                  NetFileRequest var5;
                  Buffer var6;
                  while(NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
                     var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                     var6 = new Buffer(4);
                     var6.writeByte(1);
                     var6.writeMedium((int)var5.key);
                     NetCache.NetCache_socket.write(var6.array, 0, 4);
                     NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
                     --NetCache.NetCache_pendingPriorityWritesCount;
                     ++NetCache.NetCache_pendingPriorityResponsesCount;
                  }

                  while(NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
                     var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                     var6 = new Buffer(4);
                     var6.writeByte(0);
                     var6.writeMedium((int)var5.key);
                     NetCache.NetCache_socket.write(var6.array, 0, 4);
                     var5.removeDual();
                     NetCache.NetCache_pendingResponses.put(var5, var5.key);
                     --NetCache.NetCache_pendingWritesCount;
                     ++NetCache.NetCache_pendingResponsesCount;
                  }

                  for(int var17 = 0; var17 < 100; ++var17) {
                     int var18 = NetCache.NetCache_socket.available();
                     if (var18 < 0) {
                        throw new IOException();
                     }

                     if (var18 == 0) {
                        break;
                     }

                     NetCache.NetCache_loadTime = 0;
                     byte var7 = 0;
                     if (class133.NetCache_currentResponse == null) {
                        var7 = 8;
                     } else if (NetCache.field4216 == 0) {
                        var7 = 1;
                     }

                     int var8;
                     int var9;
                     int var10;
                     int var12;
                     byte[] var10000;
                     int var10001;
                     Buffer var25;
                     if (var7 > 0) {
                        var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
                        if (var8 > var18) {
                           var8 = var18;
                        }

                        NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
                        if (NetCache.field4213 != 0) {
                           for(var9 = 0; var9 < var8; ++var9) {
                              var10000 = NetCache.NetCache_responseHeaderBuffer.array;
                              var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
                              var10000[var10001] ^= NetCache.field4213;
                           }
                        }

                        var25 = NetCache.NetCache_responseHeaderBuffer;
                        var25.offset += var8;
                        if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
                           break;
                        }

                        if (class133.NetCache_currentResponse == null) {
                           NetCache.NetCache_responseHeaderBuffer.offset = 0;
                           var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
                           int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
                           long var13 = (long)(var10 + (var9 << 16));
                           NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
                           VarpDefinition.field1891 = true;
                           if (var15 == null) {
                              var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
                              VarpDefinition.field1891 = false;
                           }

                           if (var15 == null) {
                              throw new IOException();
                           }

                           int var16 = var11 == 0 ? 5 : 9;
                           class133.NetCache_currentResponse = var15;
                           NetCache.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + class133.NetCache_currentResponse.padding);
                           NetCache.NetCache_responseArchiveBuffer.writeByte(var11);
                           NetCache.NetCache_responseArchiveBuffer.writeInt(var12);
                           NetCache.field4216 = 8;
                           NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        } else if (NetCache.field4216 == 0) {
                           if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
                              NetCache.field4216 = 1;
                              NetCache.NetCache_responseHeaderBuffer.offset = 0;
                           } else {
                              class133.NetCache_currentResponse = null;
                           }
                        }
                     } else {
                        var8 = NetCache.NetCache_responseArchiveBuffer.array.length - class133.NetCache_currentResponse.padding;
                        var9 = 512 - NetCache.field4216;
                        if (var9 > var8 - NetCache.NetCache_responseArchiveBuffer.offset) {
                           var9 = var8 - NetCache.NetCache_responseArchiveBuffer.offset;
                        }

                        if (var9 > var18) {
                           var9 = var18;
                        }

                        NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var9);
                        if (NetCache.field4213 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              var10000 = NetCache.NetCache_responseArchiveBuffer.array;
                              var10001 = NetCache.NetCache_responseArchiveBuffer.offset + var10;
                              var10000[var10001] ^= NetCache.field4213;
                           }
                        }

                        var25 = NetCache.NetCache_responseArchiveBuffer;
                        var25.offset += var9;
                        NetCache.field4216 += var9;
                        if (var8 == NetCache.NetCache_responseArchiveBuffer.offset) {
                           if (16711935L == class133.NetCache_currentResponse.key) {
                              HealthBarUpdate.field1223 = NetCache.NetCache_responseArchiveBuffer;

                              for(var10 = 0; var10 < 256; ++var10) {
                                 Archive var19 = NetCache.NetCache_archives[var10];
                                 if (var19 != null) {
                                    HealthBarUpdate.field1223.offset = var10 * 8 + 5;
                                    if (HealthBarUpdate.field1223.offset >= HealthBarUpdate.field1223.array.length) {
                                       if (!var19.field4179) {
                                          throw new RuntimeException("");
                                       }

                                       var19.method6386();
                                    } else {
                                       var12 = HealthBarUpdate.field1223.readInt();
                                       int var20 = HealthBarUpdate.field1223.readInt();
                                       var19.loadIndex(var12, var20);
                                    }
                                 }
                              }
                           } else {
                              NetCache.NetCache_crc.reset();
                              NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var8);
                              var10 = (int)NetCache.NetCache_crc.getValue();
                              if (var10 != class133.NetCache_currentResponse.crc) {
                                 try {
                                    NetCache.NetCache_socket.close();
                                 } catch (Exception var23) {
                                 }

                                 ++NetCache.NetCache_crcMismatches;
                                 NetCache.NetCache_socket = null;
                                 NetCache.field4213 = (byte)((int)(Math.random() * 255.0 + 1.0));
                                 var1 = false;
                                 break label250;
                              }

                              NetCache.NetCache_crcMismatches = 0;
                              NetCache.NetCache_ioExceptions = 0;
                              class133.NetCache_currentResponse.archive.write((int)(class133.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, (class133.NetCache_currentResponse.key & 16711680L) == 16711680L, VarpDefinition.field1891);
                           }

                           class133.NetCache_currentResponse.remove();
                           if (VarpDefinition.field1891) {
                              --NetCache.NetCache_pendingPriorityResponsesCount;
                           } else {
                              --NetCache.NetCache_pendingResponsesCount;
                           }

                           NetCache.field4216 = 0;
                           class133.NetCache_currentResponse = null;
                           NetCache.NetCache_responseArchiveBuffer = null;
                        } else {
                           if (NetCache.field4216 != 512) {
                              break;
                           }

                           NetCache.field4216 = 0;
                        }
                     }
                  }

                  var1 = true;
               }
            } catch (IOException var24) {
               try {
                  NetCache.NetCache_socket.close();
               } catch (Exception var22) {
               }

               ++NetCache.NetCache_ioExceptions;
               NetCache.NetCache_socket = null;
               var1 = false;
            }
         }

         if (!var1) {
            this.doCycleJs5Connect();
         }

      }
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "8388607"
   )
   @Export("doCycleJs5Connect")
   void doCycleJs5Connect() {
      if (NetCache.NetCache_crcMismatches >= 4) {
         this.error("js5crc");
         class19.updateGameState(1000);
      } else {
         if (NetCache.NetCache_ioExceptions >= 4) {
            if (gameState <= 5) {
               this.error("js5io");
               class19.updateGameState(1000);
               return;
            }

            field512 = 3000;
            NetCache.NetCache_ioExceptions = 3;
         }

         if (--field512 + 1 <= 0) {
            try {
               if (js5ConnectState == 0) {
                  SequenceDefinition.js5SocketTask = GameEngine.taskHandler.newSocketTask(class188.worldHost, ClanSettings.currentPort);
                  ++js5ConnectState;
               }

               if (js5ConnectState == 1) {
                  if (SequenceDefinition.js5SocketTask.status == 2) {
                     this.js5Error(-1);
                     return;
                  }

                  if (SequenceDefinition.js5SocketTask.status == 1) {
                     ++js5ConnectState;
                  }
               }

               Buffer var3;
               if (js5ConnectState == 2) {
                  Socket var2 = (Socket)SequenceDefinition.js5SocketTask.result;
                  BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
                  PcmPlayer.js5Socket = var1;
                  var3 = new Buffer(5);
                  var3.writeByte(15);
                  var3.writeInt(212);
                  PcmPlayer.js5Socket.write(var3.array, 0, 5);
                  ++js5ConnectState;
                  class305.field3439 = WorldMapSection2.method4844();
               }

               if (js5ConnectState == 3) {
                  if (PcmPlayer.js5Socket.available() > 0) {
                     int var5 = PcmPlayer.js5Socket.readUnsignedByte();
                     if (var5 != 0) {
                        this.js5Error(var5);
                        return;
                     }

                     ++js5ConnectState;
                  } else if (WorldMapSection2.method4844() - class305.field3439 > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (js5ConnectState == 4) {
                  AbstractSocket var11 = PcmPlayer.js5Socket;
                  boolean var6 = gameState > 20;
                  if (NetCache.NetCache_socket != null) {
                     try {
                        NetCache.NetCache_socket.close();
                     } catch (Exception var9) {
                     }

                     NetCache.NetCache_socket = null;
                  }

                  NetCache.NetCache_socket = var11;
                  class166.method3383(var6);
                  NetCache.NetCache_responseHeaderBuffer.offset = 0;
                  class133.NetCache_currentResponse = null;
                  NetCache.NetCache_responseArchiveBuffer = null;
                  NetCache.field4216 = 0;

                  while(true) {
                     NetFileRequest var12 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
                     if (var12 == null) {
                        while(true) {
                           var12 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
                           if (var12 == null) {
                              if (NetCache.field4213 != 0) {
                                 try {
                                    var3 = new Buffer(4);
                                    var3.writeByte(4);
                                    var3.writeByte(NetCache.field4213);
                                    var3.writeShort(0);
                                    NetCache.NetCache_socket.write(var3.array, 0, 4);
                                 } catch (IOException var8) {
                                    try {
                                       NetCache.NetCache_socket.close();
                                    } catch (Exception var7) {
                                    }

                                    ++NetCache.NetCache_ioExceptions;
                                    NetCache.NetCache_socket = null;
                                 }
                              }

                              NetCache.NetCache_loadTime = 0;
                              NetCache.field4204 = WorldMapSection2.method4844();
                              SequenceDefinition.js5SocketTask = null;
                              PcmPlayer.js5Socket = null;
                              js5ConnectState = 0;
                              js5Errors = 0;
                              return;
                           }

                           NetCache.NetCache_pendingWritesQueue.addLast(var12);
                           NetCache.NetCache_pendingWrites.put(var12, var12.key);
                           ++NetCache.NetCache_pendingWritesCount;
                           --NetCache.NetCache_pendingResponsesCount;
                        }
                     }

                     NetCache.NetCache_pendingPriorityWrites.put(var12, var12.key);
                     ++NetCache.NetCache_pendingPriorityWritesCount;
                     --NetCache.NetCache_pendingPriorityResponsesCount;
                  }
               }
            } catch (IOException var10) {
               this.js5Error(-3);
            }

         }
      }
   }

   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-605463704"
   )
   @Export("js5Error")
   void js5Error(int var1) {
      SequenceDefinition.js5SocketTask = null;
      PcmPlayer.js5Socket = null;
      js5ConnectState = 0;
      if (ClanSettings.currentPort == class290.worldPort) {
         ClanSettings.currentPort = Calendar.js5Port;
      } else {
         ClanSettings.currentPort = class290.worldPort;
      }

      ++js5Errors;
      if (js5Errors < 2 || var1 != 7 && var1 != 9) {
         if (js5Errors >= 2 && var1 == 6) {
            this.error("js5connect_outofdate");
            class19.updateGameState(1000);
         } else if (js5Errors >= 4) {
            if (gameState <= 5) {
               this.error("js5connect");
               class19.updateGameState(1000);
            } else {
               field512 = 3000;
            }
         }
      } else if (gameState <= 5) {
         this.error("js5connect_full");
         class19.updateGameState(1000);
      } else {
         field512 = 3000;
      }

   }

   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-44"
   )
   @Export("doCycleLoggedOut")
   final void doCycleLoggedOut() {
      Object var1 = packetWriter.getSocket();
      PacketBuffer var2 = packetWriter.packetBuffer;

      try {
         if (loginState == 0) {
            if (class133.secureRandom == null && (secureRandomFuture.isDone() || field549 > 250)) {
               class133.secureRandom = secureRandomFuture.get();
               secureRandomFuture.shutdown();
               secureRandomFuture = null;
            }

            if (class133.secureRandom != null) {
               if (var1 != null) {
                  ((AbstractSocket)var1).close();
                  var1 = null;
               }

               UserComparator3.socketTask = null;
               hadNetworkError = false;
               field549 = 0;
               if (field519.method8928()) {
                  if (this.method1222()) {
                     try {
                        this.method1225(class12.field63);
                        class60.method1155(21);
                     } catch (Throwable var26) {
                        class364.RunException_sendStackTrace((String)null, var26);
                        class11.getLoginError(65);
                        return;
                     }
                  } else {
                     if (!this.method1223()) {
                        class11.getLoginError(65);
                        return;
                     }

                     try {
                        this.method1227(class90.field1120, class433.field4642);
                        class60.method1155(20);
                     } catch (Exception var25) {
                        class364.RunException_sendStackTrace((String)null, var25);
                        class11.getLoginError(65);
                        return;
                     }
                  }
               } else {
                  class60.method1155(1);
               }
            }
         }

         class20 var29;
         if (loginState == 21) {
            if (this.field551 != null) {
               if (!this.field551.isDone()) {
                  return;
               }

               if (this.field551.isCancelled()) {
                  class11.getLoginError(65);
                  this.field551 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field551.get();
                  if (!var3.isSuccess()) {
                     class11.getLoginError(65);
                     this.field551 = null;
                     return;
                  }

                  class308.field3460 = var3.getAccessToken();
                  class12.field63 = var3.getRefreshToken();
                  this.field551 = null;
               } catch (Exception var24) {
                  class364.RunException_sendStackTrace((String)null, var24);
                  class11.getLoginError(65);
                  this.field551 = null;
                  return;
               }
            } else {
               if (this.field526 == null) {
                  class11.getLoginError(65);
                  return;
               }

               if (!this.field526.method264()) {
                  return;
               }

               if (this.field526.method272()) {
                  class364.RunException_sendStackTrace(this.field526.method269(), (Throwable)null);
                  class11.getLoginError(65);
                  this.field526 = null;
                  return;
               }

               var29 = this.field526.method265();
               if (var29.method285() != 200) {
                  class11.getLoginError(65);
                  this.field526 = null;
                  return;
               }

               field549 = 0;
               class433 var4 = new class433(var29.method286());

               try {
                  class308.field3460 = var4.method7980().getString("access_token");
                  class12.field63 = var4.method7980().getString("refresh_token");
               } catch (Exception var23) {
                  class364.RunException_sendStackTrace("Error parsing tokens", var23);
                  class11.getLoginError(65);
                  this.field526 = null;
                  return;
               }
            }

            this.method1384(class308.field3460);
            class60.method1155(20);
         }

         if (loginState == 20) {
            if (this.field524 != null) {
               if (!this.field524.isDone()) {
                  return;
               }

               if (this.field524.isCancelled()) {
                  class11.getLoginError(65);
                  this.field524 = null;
                  return;
               }

               try {
                  OtlTokenResponse var30 = (OtlTokenResponse)this.field524.get();
                  if (!var30.isSuccess()) {
                     class11.getLoginError(65);
                     this.field524 = null;
                     return;
                  }

                  this.field520 = var30.getToken();
                  this.field524 = null;
               } catch (Exception var22) {
                  class364.RunException_sendStackTrace((String)null, var22);
                  class11.getLoginError(65);
                  this.field524 = null;
                  return;
               }
            } else {
               if (this.field522 == null) {
                  class11.getLoginError(65);
                  return;
               }

               if (!this.field522.method264()) {
                  return;
               }

               if (this.field522.method272()) {
                  class364.RunException_sendStackTrace(this.field522.method269(), (Throwable)null);
                  class11.getLoginError(65);
                  this.field522 = null;
                  return;
               }

               var29 = this.field522.method265();
               if (var29.method285() != 200) {
                  class364.RunException_sendStackTrace("Response code: " + var29.method285() + "Response body: " + var29.method286(), (Throwable)null);
                  class11.getLoginError(65);
                  this.field522 = null;
                  return;
               }

               List var32 = (List)var29.method283().get("Content-Type");
               if (var32 != null && var32.contains(class431.field4639.method7965())) {
                  try {
                     JSONObject var5 = new JSONObject(var29.method286());
                     this.field520 = var5.getString("token");
                  } catch (JSONException var21) {
                     class364.RunException_sendStackTrace((String)null, var21);
                     class11.getLoginError(65);
                     this.field522 = null;
                     return;
                  }
               } else {
                  this.field520 = var29.method286();
               }

               this.field522 = null;
            }

            field549 = 0;
            class60.method1155(1);
         }

         if (loginState == 1) {
            if (UserComparator3.socketTask == null) {
               UserComparator3.socketTask = GameEngine.taskHandler.newSocketTask(class188.worldHost, ClanSettings.currentPort);
            }

            if (UserComparator3.socketTask.status == 2) {
               throw new IOException();
            }

            if (UserComparator3.socketTask.status == 1) {
               Socket var34 = (Socket)UserComparator3.socketTask.result;
               BufferedNetSocket var31 = new BufferedNetSocket(var34, 40000, 5000);
               var1 = var31;
               packetWriter.setSocket(var31);
               UserComparator3.socketTask = null;
               class60.method1155(2);
            }
         }

         PacketBufferNode var33;
         if (loginState == 2) {
            packetWriter.clearBuffer();
            var33 = ViewportMouse.method4751();
            var33.packetBuffer.writeByte(LoginPacket.field3290.id);
            packetWriter.addNode(var33);
            packetWriter.flush();
            var2.offset = 0;
            class60.method1155(3);
         }

         int var14;
         if (loginState == 3) {
            if (Interpreter.pcmPlayer0 != null) {
               Interpreter.pcmPlayer0.method817();
            }

            if (ViewportMouse.pcmPlayer1 != null) {
               ViewportMouse.pcmPlayer1.method817();
            }

            if (((AbstractSocket)var1).isAvailable(1)) {
               var14 = ((AbstractSocket)var1).readUnsignedByte();
               if (Interpreter.pcmPlayer0 != null) {
                  Interpreter.pcmPlayer0.method817();
               }

               if (ViewportMouse.pcmPlayer1 != null) {
                  ViewportMouse.pcmPlayer1.method817();
               }

               if (var14 != 0) {
                  class11.getLoginError(var14);
                  return;
               }

               var2.offset = 0;
               class60.method1155(4);
            }
         }

         if (loginState == 4) {
            if (var2.offset < 8) {
               var14 = ((AbstractSocket)var1).available();
               if (var14 > 8 - var2.offset) {
                  var14 = 8 - var2.offset;
               }

               if (var14 > 0) {
                  ((AbstractSocket)var1).read(var2.array, var2.offset, var14);
                  var2.offset += var14;
               }
            }

            if (var2.offset == 8) {
               var2.offset = 0;
               Bounds.field4584 = var2.readLong();
               class60.method1155(5);
            }
         }

         int var6;
         if (loginState == 5) {
            packetWriter.packetBuffer.offset = 0;
            packetWriter.clearBuffer();
            PacketBuffer var35 = new PacketBuffer(500);
            int[] var36 = new int[]{class133.secureRandom.nextInt(), class133.secureRandom.nextInt(), class133.secureRandom.nextInt(), class133.secureRandom.nextInt()};
            var35.offset = 0;
            var35.writeByte(1);
            var35.writeInt(var36[0]);
            var35.writeInt(var36[1]);
            var35.writeInt(var36[2]);
            var35.writeInt(var36[3]);
            var35.writeLong(Bounds.field4584);
            if (gameState == 40) {
               var35.writeInt(class18.field95[0]);
               var35.writeInt(class18.field95[1]);
               var35.writeInt(class18.field95[2]);
               var35.writeInt(class18.field95[3]);
            } else {
               if (gameState == 50) {
                  var35.writeByte(class136.field1597.rsOrdinal());
                  var35.writeInt(class31.field167);
               } else {
                  var35.writeByte(field518.rsOrdinal());
                  switch (field518.field1600) {
                     case 0:
                     case 3:
                        var35.writeMedium(FriendSystem.field800);
                        ++var35.offset;
                        break;
                     case 1:
                        var35.writeInt(WorldMapSectionType.clientPreferences.method2453(Login.Login_username));
                        break;
                     case 2:
                        var35.offset += 4;
                  }
               }

               if (field519.method8928()) {
                  var35.writeByte(class482.field4956.rsOrdinal());
                  var35.writeStringCp1252NullTerminated(this.field520);
               } else {
                  var35.writeByte(class482.field4962.rsOrdinal());
                  var35.writeStringCp1252NullTerminated(Login.Login_password);
               }
            }

            var35.encryptRsa(class72.field883, class72.field881);
            class18.field95 = var36;
            PacketBufferNode var37 = ViewportMouse.method4751();
            var37.packetBuffer.offset = 0;
            if (gameState == 40) {
               var37.packetBuffer.writeByte(LoginPacket.field3286.id);
            } else {
               var37.packetBuffer.writeByte(LoginPacket.field3288.id);
            }

            var37.packetBuffer.writeShort(0);
            var6 = var37.packetBuffer.offset;
            var37.packetBuffer.writeInt(212);
            var37.packetBuffer.writeInt(1);
            var37.packetBuffer.writeByte(clientType);
            var37.packetBuffer.writeByte(field488);
            byte var7 = 0;
            var37.packetBuffer.writeByte(var7);
            var37.packetBuffer.writeBytes(var35.array, 0, var35.offset);
            int var8 = var37.packetBuffer.offset;
            var37.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
            var37.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
            var37.packetBuffer.writeShort(GameEngine.canvasWidth);
            var37.packetBuffer.writeShort(class143.canvasHeight);
            PacketBuffer var9 = var37.packetBuffer;
            int var12;
            if (randomDatData != null) {
               var9.writeBytes(randomDatData, 0, randomDatData.length);
            } else {
               byte[] var11 = new byte[24];

               try {
                  JagexCache.JagexCache_randomDat.seek(0L);
                  JagexCache.JagexCache_randomDat.readFully(var11);

                  for(var12 = 0; var12 < 24 && var11[var12] == 0; ++var12) {
                  }

                  if (var12 >= 24) {
                     throw new IOException();
                  }
               } catch (Exception var27) {
                  for(int var13 = 0; var13 < 24; ++var13) {
                     var11[var13] = -1;
                  }
               }

               var9.writeBytes(var11, 0, var11.length);
            }

            var37.packetBuffer.writeStringCp1252NullTerminated(FontName.field4790);
            var37.packetBuffer.writeInt(RouteStrategy.field2330);
            Buffer var10 = new Buffer(HealthBarUpdate.platformInfo.size());
            HealthBarUpdate.platformInfo.write(var10);
            var37.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
            var37.packetBuffer.writeByte(clientType);
            var37.packetBuffer.writeInt(0);
            var37.packetBuffer.writeIntME(class20.field113.hash);
            var37.packetBuffer.writeIntLE(class475.archive20.hash);
            var37.packetBuffer.writeIntME(class127.archive17.hash);
            var37.packetBuffer.writeIntME(AABB.archive10.hash);
            var37.packetBuffer.writeIntME(TextureProvider.archive13.hash);
            var37.packetBuffer.writeIntME(class308.archive6.hash);
            var37.packetBuffer.writeIntME(class167.archive12.hash);
            var37.packetBuffer.writeInt(class376.archive18.hash);
            var37.packetBuffer.writeIntLE(class36.field239.hash);
            var37.packetBuffer.writeIntME(ClientPreferences.archive9.hash);
            var37.packetBuffer.writeIntLE(class135.archive4.hash);
            var37.packetBuffer.writeInt(class175.field1841.hash);
            var37.packetBuffer.writeIntIME(UserComparator5.field1419.hash);
            var37.packetBuffer.writeIntIME(class258.archive2.hash);
            var37.packetBuffer.writeIntLE(0);
            var37.packetBuffer.writeIntIME(class90.archive14.hash);
            var37.packetBuffer.writeIntLE(MusicPatchPcmStream.archive15.hash);
            var37.packetBuffer.writeIntLE(MusicPatchNode.archive19.hash);
            var37.packetBuffer.writeIntME(class143.archive8.hash);
            var37.packetBuffer.writeIntME(class290.archive7.hash);
            var37.packetBuffer.writeInt(Clock.archive11.hash);
            var37.packetBuffer.xteaEncrypt(var36, var8, var37.packetBuffer.offset);
            var37.packetBuffer.writeLengthShort(var37.packetBuffer.offset - var6);
            packetWriter.addNode(var37);
            packetWriter.flush();
            packetWriter.isaacCipher = new IsaacCipher(var36);
            int[] var45 = new int[4];

            for(var12 = 0; var12 < 4; ++var12) {
               var45[var12] = var36[var12] + 50;
            }

            var2.newIsaacCipher(var45);
            class60.method1155(6);
         }

         int var16;
         if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
            var14 = ((AbstractSocket)var1).readUnsignedByte();
            if (var14 == 61) {
               var16 = ((AbstractSocket)var1).available();
               class157.field1742 = var16 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
               class60.method1155(5);
            }

            if (var14 == 21 && gameState == 20) {
               class60.method1155(12);
            } else if (var14 == 2) {
               class60.method1155(14);
            } else if (var14 == 15 && gameState == 40) {
               packetWriter.serverPacketLength = -1;
               class60.method1155(19);
            } else if (var14 == 64) {
               class60.method1155(10);
            } else if (var14 == 23 && field516 < 1) {
               ++field516;
               class60.method1155(0);
            } else if (var14 == 29) {
               class60.method1155(17);
            } else {
               if (var14 != 69) {
                  class11.getLoginError(var14);
                  return;
               }

               class60.method1155(7);
            }
         }

         if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
            ((AbstractSocket)var1).read(var2.array, 0, 2);
            var2.offset = 0;
            ReflectionCheck.field257 = var2.readUnsignedShort();
            class60.method1155(8);
         }

         if (loginState == 8 && ((AbstractSocket)var1).available() >= ReflectionCheck.field257) {
            var2.offset = 0;
            ((AbstractSocket)var1).read(var2.array, var2.offset, ReflectionCheck.field257);
            class6[] var38 = new class6[]{class6.field17};
            class6 var39 = var38[var2.readUnsignedByte()];

            try {
               switch (var39.field12) {
                  case 0:
                     class0 var40 = new class0();
                     this.field658 = new class7(var2, var40);
                     class60.method1155(9);
                     break;
                  default:
                     throw new IllegalArgumentException();
               }
            } catch (Exception var20) {
               class11.getLoginError(22);
               return;
            }
         }

         if (loginState == 9 && this.field658.method50()) {
            this.field634 = this.field658.method39();
            this.field658.method48();
            this.field658 = null;
            if (this.field634 == null) {
               class11.getLoginError(22);
               return;
            }

            packetWriter.clearBuffer();
            var33 = ViewportMouse.method4751();
            var33.packetBuffer.writeByte(LoginPacket.field3289.id);
            var33.packetBuffer.writeShort(this.field634.offset);
            var33.packetBuffer.writeBuffer(this.field634);
            packetWriter.addNode(var33);
            packetWriter.flush();
            this.field634 = null;
            class60.method1155(6);
         }

         if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
            class10.field53 = ((AbstractSocket)var1).readUnsignedByte();
            class60.method1155(11);
         }

         if (loginState == 11 && ((AbstractSocket)var1).available() >= class10.field53) {
            ((AbstractSocket)var1).read(var2.array, 0, class10.field53);
            var2.offset = 0;
            class60.method1155(6);
         }

         if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
            field487 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
            class60.method1155(13);
         }

         if (loginState == 13) {
            field549 = 0;
            Tile.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field487 / 60 + " seconds.");
            if (--field487 <= 0) {
               class60.method1155(0);
            }

         } else {
            if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
               Messages.field1375 = ((AbstractSocket)var1).readUnsignedByte();
               class60.method1155(15);
            }

            if (loginState == 15 && ((AbstractSocket)var1).available() >= Messages.field1375) {
               boolean var46 = ((AbstractSocket)var1).readUnsignedByte() == 1;
               ((AbstractSocket)var1).read(var2.array, 0, 4);
               var2.offset = 0;
               boolean var47 = false;
               if (var46) {
                  var16 = var2.readByteIsaac() << 24;
                  var16 |= var2.readByteIsaac() << 16;
                  var16 |= var2.readByteIsaac() << 8;
                  var16 |= var2.readByteIsaac();
                  WorldMapSectionType.clientPreferences.method2488(Login.Login_username, var16);
               }

               if (Login_isUsernameRemembered) {
                  WorldMapSectionType.clientPreferences.method2439(Login.Login_username);
               } else {
                  WorldMapSectionType.clientPreferences.method2439((String)null);
               }

               class146.savePreferences();
               staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
               playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
               localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
               localPlayerIndex <<= 8;
               localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
               field603 = ((AbstractSocket)var1).readUnsignedByte();
               ((AbstractSocket)var1).read(var2.array, 0, 8);
               var2.offset = 0;
               this.field534 = var2.readLong();
               if (Messages.field1375 >= 29) {
                  ((AbstractSocket)var1).read(var2.array, 0, 8);
                  var2.offset = 0;
                  field671 = var2.readLong();
               }

               ((AbstractSocket)var1).read(var2.array, 0, 1);
               var2.offset = 0;
               ServerPacket[] var43 = class258.ServerPacket_values();
               var6 = var2.readSmartByteShortIsaac();
               if (var6 < 0 || var6 >= var43.length) {
                  throw new IOException(var6 + " " + var2.offset);
               }

               packetWriter.serverPacket = var43[var6];
               packetWriter.serverPacketLength = packetWriter.serverPacket.length;
               ((AbstractSocket)var1).read(var2.array, 0, 2);
               var2.offset = 0;
               packetWriter.serverPacketLength = var2.readUnsignedShort();

               try {
                  class26.method374(class392.client, "zap");
               } catch (Throwable var19) {
               }

               class60.method1155(16);
            }

            if (loginState == 16) {
               if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
                  timer.method7335();
                  class395.method7439();
                  DirectByteArrayCopier.updatePlayer(var2);
                  class124.field1471 = -1;
                  Skeleton.loadRegions(false, var2);
                  packetWriter.serverPacket = null;
               }

            } else {
               if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, 2);
                  var2.offset = 0;
                  class495.field5036 = var2.readUnsignedShort();
                  class60.method1155(18);
               }

               if (loginState == 18 && ((AbstractSocket)var1).available() >= class495.field5036) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, class495.field5036);
                  var2.offset = 0;
                  String var42 = var2.readStringCp1252NullTerminated();
                  String var41 = var2.readStringCp1252NullTerminated();
                  String var44 = var2.readStringCp1252NullTerminated();
                  Tile.setLoginResponseString(var42, var41, var44);
                  class19.updateGameState(10);
                  if (field519.method8928()) {
                     class14.method173(9);
                  }
               }

               if (loginState == 19) {
                  if (packetWriter.serverPacketLength == -1) {
                     if (((AbstractSocket)var1).available() < 2) {
                        return;
                     }

                     ((AbstractSocket)var1).read(var2.array, 0, 2);
                     var2.offset = 0;
                     packetWriter.serverPacketLength = var2.readUnsignedShort();
                  }

                  if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
                     ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
                     var2.offset = 0;
                     var14 = packetWriter.serverPacketLength;
                     timer.method7325();
                     StudioGame.method6344();
                     DirectByteArrayCopier.updatePlayer(var2);
                     if (var14 != var2.offset) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field549;
                  if (field549 > 2000) {
                     if (field516 < 1) {
                        if (class290.worldPort == ClanSettings.currentPort) {
                           ClanSettings.currentPort = Calendar.js5Port;
                        } else {
                           ClanSettings.currentPort = class290.worldPort;
                        }

                        ++field516;
                        class60.method1155(0);
                     } else {
                        class11.getLoginError(-3);
                     }
                  }
               }
            }
         }
      } catch (IOException var28) {
         if (field516 < 1) {
            if (ClanSettings.currentPort == class290.worldPort) {
               ClanSettings.currentPort = Calendar.js5Port;
            } else {
               ClanSettings.currentPort = class290.worldPort;
            }

            ++field516;
            class60.method1155(0);
         } else {
            class11.getLoginError(-2);
         }
      }
   }

   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-78458791"
   )
   @Export("doCycleLoggedIn")
   final void doCycleLoggedIn() {
      if (rebootTimer > 1) {
         --rebootTimer;
      }

      if (logoutTimer > 0) {
         --logoutTimer;
      }

      if (hadNetworkError) {
         hadNetworkError = false;
         PendingSpawn.method2350();
      } else {
         if (!isMenuOpen) {
            ClanMate.addCancelMenuEntry();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1652(packetWriter); ++var1) {
         }

         if (gameState == 30) {
            int var2;
            PacketBufferNode var14;
            while(WorldMapCacheName.method5296()) {
               var14 = UserComparator9.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
               var14.packetBuffer.writeByte(0);
               var2 = var14.packetBuffer.offset;
               AttackOption.performReflectionCheck(var14.packetBuffer);
               var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
               packetWriter.addNode(var14);
            }

            if (timer.field4434) {
               var14 = UserComparator9.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
               var14.packetBuffer.writeByte(0);
               var2 = var14.packetBuffer.offset;
               timer.write(var14.packetBuffer);
               var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
               packetWriter.addNode(var14);
               timer.method7324();
            }

            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            synchronized(class212.mouseRecorder.lock) {
               if (!field480) {
                  class212.mouseRecorder.index = 0;
               } else if (MouseHandler.MouseHandler_lastButton != 0 || class212.mouseRecorder.index >= 40) {
                  PacketBufferNode var15 = null;
                  var3 = 0;
                  var4 = 0;
                  var5 = 0;
                  var6 = 0;

                  for(var7 = 0; var7 < class212.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
                     var4 = var7;
                     var8 = class212.mouseRecorder.ys[var7];
                     if (var8 < -1) {
                        var8 = -1;
                     } else if (var8 > 65534) {
                        var8 = 65534;
                     }

                     var9 = class212.mouseRecorder.xs[var7];
                     if (var9 < -1) {
                        var9 = -1;
                     } else if (var9 > 65534) {
                        var9 = 65534;
                     }

                     if (var9 != field515 || var8 != field496) {
                        if (var15 == null) {
                           var15 = UserComparator9.getPacketBufferNode(ClientPacket.field3060, packetWriter.isaacCipher);
                           var15.packetBuffer.writeByte(0);
                           var3 = var15.packetBuffer.offset;
                           PacketBuffer var10000 = var15.packetBuffer;
                           var10000.offset += 2;
                           var5 = 0;
                           var6 = 0;
                        }

                        if (-1L != field497) {
                           var10 = var9 - field515;
                           var11 = var8 - field496;
                           var12 = (int)((class212.mouseRecorder.millis[var7] - field497) / 20L);
                           var5 = (int)((long)var5 + (class212.mouseRecorder.millis[var7] - field497) % 20L);
                        } else {
                           var10 = var9;
                           var11 = var8;
                           var12 = Integer.MAX_VALUE;
                        }

                        field515 = var9;
                        field496 = var8;
                        if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                           var10 += 32;
                           var11 += 32;
                           var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
                        } else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                           var10 += 128;
                           var11 += 128;
                           var15.packetBuffer.writeByte(var12 + 128);
                           var15.packetBuffer.writeShort(var11 + (var10 << 8));
                        } else if (var12 < 32) {
                           var15.packetBuffer.writeByte(var12 + 192);
                           if (var9 != -1 && var8 != -1) {
                              var15.packetBuffer.writeInt(var9 | var8 << 16);
                           } else {
                              var15.packetBuffer.writeInt(Integer.MIN_VALUE);
                           }
                        } else {
                           var15.packetBuffer.writeShort((var12 & 8191) + '\ue000');
                           if (var9 != -1 && var8 != -1) {
                              var15.packetBuffer.writeInt(var9 | var8 << 16);
                           } else {
                              var15.packetBuffer.writeInt(Integer.MIN_VALUE);
                           }
                        }

                        ++var6;
                        field497 = class212.mouseRecorder.millis[var7];
                     }
                  }

                  if (var15 != null) {
                     var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3);
                     var7 = var15.packetBuffer.offset;
                     var15.packetBuffer.offset = var3;
                     var15.packetBuffer.writeByte(var5 / var6);
                     var15.packetBuffer.writeByte(var5 % var6);
                     var15.packetBuffer.offset = var7;
                     packetWriter.addNode(var15);
                  }

                  if (var4 >= class212.mouseRecorder.index) {
                     class212.mouseRecorder.index = 0;
                  } else {
                     MouseRecorder var40 = class212.mouseRecorder;
                     var40.index -= var4;
                     System.arraycopy(class212.mouseRecorder.xs, var4, class212.mouseRecorder.xs, 0, class212.mouseRecorder.index);
                     System.arraycopy(class212.mouseRecorder.ys, var4, class212.mouseRecorder.ys, 0, class212.mouseRecorder.index);
                     System.arraycopy(class212.mouseRecorder.millis, var4, class212.mouseRecorder.millis, 0, class212.mouseRecorder.index);
                  }
               }
            }

            PacketBufferNode var18;
            if (MouseHandler.MouseHandler_lastButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
               long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
               if (var16 > 32767L) {
                  var16 = 32767L;
               }

               mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
               var3 = MouseHandler.MouseHandler_lastPressedY;
               if (var3 < 0) {
                  var3 = 0;
               } else if (var3 > class143.canvasHeight) {
                  var3 = class143.canvasHeight;
               }

               var4 = MouseHandler.MouseHandler_lastPressedX;
               if (var4 < 0) {
                  var4 = 0;
               } else if (var4 > GameEngine.canvasWidth) {
                  var4 = GameEngine.canvasWidth;
               }

               var5 = (int)var16;
               var18 = UserComparator9.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
               var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
               var18.packetBuffer.writeShort(var4);
               var18.packetBuffer.writeShort(var3);
               packetWriter.addNode(var18);
            }

            if (field712.field2291 > 0) {
               var14 = UserComparator9.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
               var14.packetBuffer.writeShort(0);
               var2 = var14.packetBuffer.offset;
               long var19 = WorldMapSection2.method4844();

               for(var5 = 0; var5 < field712.field2291; ++var5) {
                  long var21 = var19 - field622;
                  if (var21 > 16777215L) {
                     var21 = 16777215L;
                  }

                  field622 = var19;
                  var14.packetBuffer.writeByteSub(field712.field2290[var5]);
                  var14.packetBuffer.method8801((int)var21);
               }

               var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
               packetWriter.addNode(var14);
            }

            if (field577 > 0) {
               --field577;
            }

            if (field712.method4074(96) || field712.method4074(97) || field712.method4074(98) || field712.method4074(99)) {
               field578 = true;
            }

            if (field578 && field577 <= 0) {
               field577 = 20;
               field578 = false;
               var14 = UserComparator9.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
               var14.packetBuffer.writeShortAddLE(camAngleY);
               var14.packetBuffer.writeShort(camAngleX);
               packetWriter.addNode(var14);
            }

            if (Varps.hasFocus && !hadFocus) {
               hadFocus = true;
               var14 = UserComparator9.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
               var14.packetBuffer.writeByte(1);
               packetWriter.addNode(var14);
            }

            if (!Varps.hasFocus && hadFocus) {
               hadFocus = false;
               var14 = UserComparator9.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
               var14.packetBuffer.writeByte(0);
               packetWriter.addNode(var14);
            }

            if (WorldMapData_1.worldMap != null) {
               WorldMapData_1.worldMap.method8068();
            }

            class133.method3038();
            Decimator.method1120();
            int[] var33;
            if (field720 != TaskHandler.Client_plane) {
               field720 = TaskHandler.Client_plane;
               var1 = TaskHandler.Client_plane;
               var33 = class188.sceneMinimapSprite.pixels;
               var3 = var33.length;

               for(var4 = 0; var4 < var3; ++var4) {
                  var33[var4] = 0;
               }

               for(var4 = 1; var4 < 103; ++var4) {
                  var5 = (103 - var4) * 2048 + 24628;

                  for(var6 = 1; var6 < 103; ++var6) {
                     if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
                        class1.scene.drawTileMinimap(var33, var5, 512, var1, var6, var4);
                     }

                     if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
                        class1.scene.drawTileMinimap(var33, var5, 512, var1 + 1, var6, var4);
                     }

                     var5 += 4;
                  }
               }

               var4 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
               var5 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
               class188.sceneMinimapSprite.setRaster();

               for(var6 = 1; var6 < 103; ++var6) {
                  for(var7 = 1; var7 < 103; ++var7) {
                     if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
                        class16.drawObject(var1, var7, var6, var4, var5);
                     }

                     if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) {
                        class16.drawObject(var1 + 1, var7, var6, var4, var5);
                     }
                  }
               }

               mapIconCount = 0;

               for(var6 = 0; var6 < 104; ++var6) {
                  for(var7 = 0; var7 < 104; ++var7) {
                     long var23 = class1.scene.getFloorDecorationTag(TaskHandler.Client_plane, var6, var7);
                     if (0L != var23) {
                        var10 = class279.Entity_unpackID(var23);
                        var11 = WallDecoration.getObjectDefinition(var10).mapIconId;
                        if (var11 >= 0 && class123.WorldMapElement_get(var11).field1918) {
                           mapIcons[mapIconCount] = class123.WorldMapElement_get(var11).getSpriteBool(false);
                           mapIconXs[mapIconCount] = var6;
                           mapIconYs[mapIconCount] = var7;
                           ++mapIconCount;
                        }
                     }
                  }
               }

               StudioGame.rasterProvider.apply();
            }

            if (gameState == 30) {
               class18.method276();
               EnumComposition.method3652();
               ++packetWriter.field1383;
               if (packetWriter.field1383 > 750) {
                  PendingSpawn.method2350();
               } else {
                  var1 = Players.Players_count;
                  var33 = Players.Players_indices;

                  for(var3 = 0; var3 < var1; ++var3) {
                     Player var25 = players[var33[var3]];
                     if (var25 != null) {
                        ScriptEvent.updateActorSequence(var25, 1);
                     }
                  }

                  for(var1 = 0; var1 < npcCount; ++var1) {
                     var2 = npcIndices[var1];
                     NPC var26 = npcs[var2];
                     if (var26 != null) {
                        ScriptEvent.updateActorSequence(var26, var26.definition.size);
                     }
                  }

                  class129.method3025();
                  ++graphicsCycle;
                  if (mouseCrossColor != 0) {
                     mouseCrossState = mouseCrossState * 400 + 20;
                     if (mouseCrossState * 400 >= 400) {
                        mouseCrossColor = 0;
                     }
                  }

                  Widget var32 = InvDefinition.mousedOverWidgetIf1;
                  Widget var34 = Script.field975;
                  InvDefinition.mousedOverWidgetIf1 = null;
                  Script.field975 = null;
                  draggedOnWidget = null;
                  field771 = false;
                  field663 = false;
                  field714 = 0;

                  while(field712.method4081() && field714 < 128) {
                     if (staffModLevel >= 2 && field712.method4074(82) && field712.field2299 == 66) {
                        String var36 = BuddyRankComparator.method2886();
                        class392.client.method481(var36);
                     } else if (oculusOrbState != 1 || field712.field2300 <= 0) {
                        field716[field714] = field712.field2299;
                        field641[field714] = field712.field2300;
                        ++field714;
                     }
                  }

                  if (class72.method2055() && field712.method4074(82) && field712.method4074(81) && mouseWheelRotation != 0) {
                     var3 = BuddyRankComparator.localPlayer.plane - mouseWheelRotation;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > 3) {
                        var3 = 3;
                     }

                     if (var3 != BuddyRankComparator.localPlayer.plane) {
                        class163.method3359(BuddyRankComparator.localPlayer.pathX[0] + GameEngine.baseX * 64, BuddyRankComparator.localPlayer.pathY[0] + class178.baseY * 64, var3, false);
                     }

                     mouseWheelRotation = 0;
                  }

                  if (MouseHandler.MouseHandler_lastButton == 1) {
                     field713.method4070();
                  }

                  if (rootInterface != -1) {
                     AbstractWorldMapData.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class143.canvasHeight, 0, 0);
                  }

                  ++cycleCntr;

                  while(true) {
                     Widget var27;
                     Widget var35;
                     ScriptEvent var37;
                     do {
                        var37 = (ScriptEvent)field690.removeLast();
                        if (var37 == null) {
                           while(true) {
                              do {
                                 var37 = (ScriptEvent)field529.removeLast();
                                 if (var37 == null) {
                                    while(true) {
                                       do {
                                          var37 = (ScriptEvent)scriptEvents.removeLast();
                                          if (var37 == null) {
                                             while(true) {
                                                class207 var38 = (class207)field692.removeLast();
                                                if (var38 == null) {
                                                   this.menu();
                                                   if (WorldMapData_1.worldMap != null) {
                                                      WorldMapData_1.worldMap.method8078(TaskHandler.Client_plane, GameEngine.baseX * 64 + (BuddyRankComparator.localPlayer.x >> 7), class178.baseY * 64 + (BuddyRankComparator.localPlayer.y >> 7), false);
                                                      WorldMapData_1.worldMap.loadCache();
                                                   }

                                                   if (clickedWidget != null) {
                                                      this.method1248();
                                                   }

                                                   if (Scene.shouldSendWalk()) {
                                                      var3 = Scene.Scene_selectedX;
                                                      var4 = Scene.Scene_selectedY;
                                                      PacketBufferNode var39 = UserComparator9.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
                                                      var39.packetBuffer.writeByte(5);
                                                      var39.packetBuffer.writeShortAdd(class178.baseY * 64 + var4);
                                                      var39.packetBuffer.writeShort(GameEngine.baseX * 64 + var3);
                                                      var39.packetBuffer.writeByteAdd(field712.method4074(82) ? (field712.method4074(81) ? 2 : 1) : 0);
                                                      packetWriter.addNode(var39);
                                                      Scene.method4426();
                                                      mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
                                                      mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
                                                      mouseCrossColor = 1;
                                                      mouseCrossState = 0;
                                                      destinationX = var3;
                                                      destinationY = var4;
                                                   }

                                                   if (var32 != InvDefinition.mousedOverWidgetIf1) {
                                                      if (var32 != null) {
                                                         class69.invalidateWidget(var32);
                                                      }

                                                      if (InvDefinition.mousedOverWidgetIf1 != null) {
                                                         class69.invalidateWidget(InvDefinition.mousedOverWidgetIf1);
                                                      }
                                                   }

                                                   if (var34 != Script.field975 && field536 == field550) {
                                                      if (var34 != null) {
                                                         class69.invalidateWidget(var34);
                                                      }

                                                      if (Script.field975 != null) {
                                                         class69.invalidateWidget(Script.field975);
                                                      }
                                                   }

                                                   if (Script.field975 != null) {
                                                      if (field536 < field550) {
                                                         ++field536;
                                                         if (field550 == field536) {
                                                            class69.invalidateWidget(Script.field975);
                                                         }
                                                      }
                                                   } else if (field536 > 0) {
                                                      --field536;
                                                   }

                                                   if (oculusOrbState == 0) {
                                                      var3 = BuddyRankComparator.localPlayer.x;
                                                      var4 = BuddyRankComparator.localPlayer.y;
                                                      if (GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX - var3 < -500 || GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX - var3 > 500 || ReflectionCheck.oculusOrbFocalPointY - var4 < -500 || ReflectionCheck.oculusOrbFocalPointY - var4 > 500) {
                                                         GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX = var3;
                                                         ReflectionCheck.oculusOrbFocalPointY = var4;
                                                      }

                                                      if (var3 != GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX) {
                                                         GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX += (var3 - GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX) / 16;
                                                      }

                                                      if (var4 != ReflectionCheck.oculusOrbFocalPointY) {
                                                         ReflectionCheck.oculusOrbFocalPointY += (var4 - ReflectionCheck.oculusOrbFocalPointY) / 16;
                                                      }

                                                      var5 = GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX >> 7;
                                                      var6 = ReflectionCheck.oculusOrbFocalPointY >> 7;
                                                      var7 = WorldMapDecorationType.getTileHeight(GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX, ReflectionCheck.oculusOrbFocalPointY, TaskHandler.Client_plane);
                                                      var8 = 0;
                                                      if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                                                         for(var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                                                            for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                               var11 = TaskHandler.Client_plane;
                                                               if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) {
                                                                  ++var11;
                                                               }

                                                               var12 = var7 - Tiles.Tiles_heights[var11][var9][var10];
                                                               if (var12 > var8) {
                                                                  var8 = var12;
                                                               }
                                                            }
                                                         }
                                                      }

                                                      var9 = var8 * 192;
                                                      if (var9 > 98048) {
                                                         var9 = 98048;
                                                      }

                                                      if (var9 < 32768) {
                                                         var9 = 32768;
                                                      }

                                                      if (var9 > field500) {
                                                         field500 += (var9 - field500) / 24;
                                                      } else if (var9 < field500) {
                                                         field500 += (var9 - field500) / 80;
                                                      }

                                                      class128.field1533 = WorldMapDecorationType.getTileHeight(BuddyRankComparator.localPlayer.x, BuddyRankComparator.localPlayer.y, TaskHandler.Client_plane) - camFollowHeight;
                                                   } else if (oculusOrbState == 1) {
                                                      if (field553 && BuddyRankComparator.localPlayer != null) {
                                                         var3 = BuddyRankComparator.localPlayer.pathX[0];
                                                         var4 = BuddyRankComparator.localPlayer.pathY[0];
                                                         if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                                                            GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX = BuddyRankComparator.localPlayer.x;
                                                            var5 = WorldMapDecorationType.getTileHeight(BuddyRankComparator.localPlayer.x, BuddyRankComparator.localPlayer.y, TaskHandler.Client_plane) - camFollowHeight;
                                                            if (var5 < class128.field1533) {
                                                               class128.field1533 = var5;
                                                            }

                                                            ReflectionCheck.oculusOrbFocalPointY = BuddyRankComparator.localPlayer.y;
                                                            field553 = false;
                                                         }
                                                      }

                                                      short var30 = -1;
                                                      if (field712.method4074(33)) {
                                                         var30 = 0;
                                                      } else if (field712.method4074(49)) {
                                                         var30 = 1024;
                                                      }

                                                      if (field712.method4074(48)) {
                                                         if (var30 == 0) {
                                                            var30 = 1792;
                                                         } else if (var30 == 1024) {
                                                            var30 = 1280;
                                                         } else {
                                                            var30 = 1536;
                                                         }
                                                      } else if (field712.method4074(50)) {
                                                         if (var30 == 0) {
                                                            var30 = 256;
                                                         } else if (var30 == 1024) {
                                                            var30 = 768;
                                                         } else {
                                                            var30 = 512;
                                                         }
                                                      }

                                                      byte var31 = 0;
                                                      if (field712.method4074(35)) {
                                                         var31 = -1;
                                                      } else if (field712.method4074(51)) {
                                                         var31 = 1;
                                                      }

                                                      var5 = 0;
                                                      if (var30 >= 0 || var31 != 0) {
                                                         var5 = field712.method4074(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
                                                         var5 *= 16;
                                                         field740 = var30;
                                                         field599 = var31;
                                                      }

                                                      if (field570 < var5) {
                                                         field570 += var5 / 8;
                                                         if (field570 > var5) {
                                                            field570 = var5;
                                                         }
                                                      } else if (field570 > var5) {
                                                         field570 = field570 * 9 / 10;
                                                      }

                                                      if (field570 > 0) {
                                                         var6 = field570 / 16;
                                                         if (field740 >= 0) {
                                                            var3 = field740 - class110.cameraYaw & 2047;
                                                            var7 = Rasterizer3D.Rasterizer3D_sine[var3];
                                                            var8 = Rasterizer3D.Rasterizer3D_cosine[var3];
                                                            GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX += var6 * var7 / 65536;
                                                            ReflectionCheck.oculusOrbFocalPointY += var8 * var6 / 65536;
                                                         }

                                                         if (field599 != 0) {
                                                            class128.field1533 += var6 * field599;
                                                            if (class128.field1533 > 0) {
                                                               class128.field1533 = 0;
                                                            }
                                                         }
                                                      } else {
                                                         field740 = -1;
                                                         field599 = -1;
                                                      }

                                                      if (field712.method4074(13)) {
                                                         ClanSettings.method3262();
                                                      }
                                                   }

                                                   if (MouseHandler.MouseHandler_currentButton == 4 && class319.mouseCam) {
                                                      var3 = MouseHandler.MouseHandler_y - mouseCamClickedY;
                                                      camAngleDX = var3 * 2;
                                                      mouseCamClickedY = var3 != -1 && var3 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
                                                      var4 = field691 - MouseHandler.MouseHandler_x;
                                                      camAngleDY = var4 * 2;
                                                      field691 = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_x + field691) / 2 : MouseHandler.MouseHandler_x;
                                                   } else {
                                                      if (field712.method4074(96)) {
                                                         camAngleDY += (-24 - camAngleDY) / 2;
                                                      } else if (field712.method4074(97)) {
                                                         camAngleDY += (24 - camAngleDY) / 2;
                                                      } else {
                                                         camAngleDY /= 2;
                                                      }

                                                      if (field712.method4074(98)) {
                                                         camAngleDX += (12 - camAngleDX) / 2;
                                                      } else if (field712.method4074(99)) {
                                                         camAngleDX += (-12 - camAngleDX) / 2;
                                                      } else {
                                                         camAngleDX /= 2;
                                                      }

                                                      mouseCamClickedY = MouseHandler.MouseHandler_y;
                                                      field691 = MouseHandler.MouseHandler_x;
                                                   }

                                                   camAngleY = camAngleDY / 2 + camAngleY & 2047;
                                                   camAngleX += camAngleDX / 2;
                                                   if (camAngleX < 128) {
                                                      camAngleX = 128;
                                                   }

                                                   if (camAngleX > 383) {
                                                      camAngleX = 383;
                                                   }

                                                   if (field737) {
                                                      class11.method98();
                                                   } else if (isCameraLocked) {
                                                      var3 = class4.field7 * 128 + 64;
                                                      var4 = WorldMapSectionType.field2937 * 16384 + 64;
                                                      var5 = WorldMapDecorationType.getTileHeight(var3, var4, TaskHandler.Client_plane) - class269.field3033;
                                                      PendingSpawn.method2351(var3, var5, var4);
                                                      var3 = class167.field1800 * 16384 + 64;
                                                      var4 = Canvas.field123 * 16384 + 64;
                                                      var5 = WorldMapDecorationType.getTileHeight(var3, var4, TaskHandler.Client_plane) - MidiPcmStream.field3361;
                                                      var6 = var3 - class381.cameraX;
                                                      var7 = var5 - class351.cameraY;
                                                      var8 = var4 - class471.cameraZ;
                                                      var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6));
                                                      var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531) & 2047;
                                                      var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531) & 2047;
                                                      class278.method5449(var10, var11);
                                                   }

                                                   for(var3 = 0; var3 < 5; ++var3) {
                                                      int var10002 = field566[var3]++;
                                                   }

                                                   class248.varcs.tryWrite();
                                                   var3 = ModeWhere.method6668();
                                                   var4 = GameEngine.keyHandler.method343();
                                                   if (var3 > 15000 && var4 > 15000) {
                                                      logoutTimer = 250;
                                                      MouseHandler.MouseHandler_idleCycles = 14500;
                                                      var18 = UserComparator9.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
                                                      packetWriter.addNode(var18);
                                                   }

                                                   class6.friendSystem.processFriendUpdates();
                                                   method1777();
                                                   ++packetWriter.pendingWrites;
                                                   if (packetWriter.pendingWrites > 50) {
                                                      var18 = UserComparator9.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
                                                      packetWriter.addNode(var18);
                                                   }

                                                   try {
                                                      packetWriter.flush();
                                                   } catch (IOException var28) {
                                                      PendingSpawn.method2350();
                                                   }

                                                   return;
                                                }

                                                class16.method201(var38);
                                             }
                                          }

                                          var35 = var37.widget;
                                          if (var35.childIndex < 0) {
                                             break;
                                          }

                                          var27 = WorldMapSection1.getWidget(var35.parentId);
                                       } while(var27 == null || var27.children == null || var35.childIndex >= var27.children.length || var35 != var27.children[var35.childIndex]);

                                       class9.runScriptEvent(var37);
                                    }
                                 }

                                 var35 = var37.widget;
                                 if (var35.childIndex < 0) {
                                    break;
                                 }

                                 var27 = WorldMapSection1.getWidget(var35.parentId);
                              } while(var27 == null || var27.children == null || var35.childIndex >= var27.children.length || var35 != var27.children[var35.childIndex]);

                              class9.runScriptEvent(var37);
                           }
                        }

                        var35 = var37.widget;
                        if (var35.childIndex < 0) {
                           break;
                        }

                        var27 = WorldMapSection1.getWidget(var35.parentId);
                     } while(var27 == null || var27.children == null || var35.childIndex >= var27.children.length || var35 != var27.children[var35.childIndex]);

                     class9.runScriptEvent(var37);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   @Export("resizeJS")
   void resizeJS() {
      int var1 = GameEngine.canvasWidth;
      int var2 = class143.canvasHeight;
      if (super.contentWidth < var1) {
         var1 = super.contentWidth;
      }

      if (super.contentHeight < var2) {
         var2 = super.contentHeight;
      }

      if (WorldMapSectionType.clientPreferences != null) {
         try {
            class26.method377(class392.client, "resize", new Object[]{class7.getWindowedMode()});
         } catch (Throwable var4) {
         }
      }

   }

   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1404157217"
   )
   @Export("drawLoggedIn")
   final void drawLoggedIn() {
      int var1;
      if (rootInterface != -1) {
         var1 = rootInterface;
         if (GrandExchangeEvent.loadInterface(var1)) {
            class31.drawModelComponents(class155.Widget_interfaceComponents[var1], -1);
         }
      }

      for(var1 = 0; var1 < rootWidgetCount; ++var1) {
         if (field722[var1]) {
            field697[var1] = true;
         }

         field698[var1] = field722[var1];
         field722[var1] = false;
      }

      field695 = cycle;
      viewportX = -1;
      viewportY = -1;
      if (rootInterface != -1) {
         rootWidgetCount = 0;
         GrandExchangeOfferOwnWorldComparator.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class143.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (showMouseCross) {
         if (mouseCrossColor == 1) {
            Friend.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }

         if (mouseCrossColor == 2) {
            Friend.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }
      }

      int var2;
      int var3;
      if (!isMenuOpen) {
         if (viewportX != -1) {
            var1 = viewportX;
            var2 = viewportY;
            if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
               var3 = menuOptionsCount - 1;
               String var5;
               if (isItemSelected == 1 && menuOptionsCount < 2) {
                  var5 = "Use" + " " + selectedItemName + " " + "->";
               } else if (isSpellSelected && menuOptionsCount < 2) {
                  var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
               } else {
                  var5 = SceneTilePaint.method4753(var3);
               }

               if (menuOptionsCount > 2) {
                  var5 = var5 + Canvas.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
               }

               class7.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
            }
         }
      } else {
         UserComparator2.method8945();
      }

      if (gameDrawingMode == 3) {
         for(var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field698[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
            } else if (field697[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
            }
         }
      }

      var1 = TaskHandler.Client_plane;
      var2 = BuddyRankComparator.localPlayer.x;
      var3 = BuddyRankComparator.localPlayer.y;
      int var4 = graphicsCycle;

      for(ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var13.soundEffectId != -1 || var13.soundEffectIds != null) {
            int var6 = 0;
            if (var2 > var13.maxX * 16384) {
               var6 += var2 - var13.maxX * 16384;
            } else if (var2 < var13.x * 16384) {
               var6 += var13.x * 16384 - var2;
            }

            if (var3 > var13.maxY * 16384) {
               var6 += var3 - var13.maxY * 16384;
            } else if (var3 < var13.y * 16384) {
               var6 += var13.y * 16384 - var3;
            }

            if (var6 - 64 <= var13.field812 && WorldMapSectionType.clientPreferences.method2463() != 0 && var1 == var13.plane) {
               var6 -= 64;
               if (var6 < 0) {
                  var6 = 0;
               }

               int var7 = (var13.field812 - var6) * WorldMapSectionType.clientPreferences.method2463() / var13.field812;
               Object var10000;
               if (var13.stream1 == null) {
                  if (var13.soundEffectId >= 0) {
                     var10000 = null;
                     SoundEffect var8 = SoundEffect.readSoundEffect(class175.field1841, var13.soundEffectId, 0);
                     if (var8 != null) {
                        RawSound var9 = var8.toRawSound().resample(TaskHandler.decimator);
                        RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
                        var10.setNumLoops(-1);
                        class323.pcmStreamMixer.addSubStream(var10);
                        var13.stream1 = var10;
                     }
                  }
               } else {
                  var13.stream1.method999(var7);
               }

               if (var13.stream2 == null) {
                  if (var13.soundEffectIds != null && (var13.field818 -= var4) <= 0) {
                     int var12 = (int)(Math.random() * (double)var13.soundEffectIds.length);
                     var10000 = null;
                     SoundEffect var14 = SoundEffect.readSoundEffect(class175.field1841, var13.soundEffectIds[var12], 0);
                     if (var14 != null) {
                        RawSound var15 = var14.toRawSound().resample(TaskHandler.decimator);
                        RawPcmStream var11 = RawPcmStream.createRawPcmStream(var15, 100, var7);
                        var11.setNumLoops(0);
                        class323.pcmStreamMixer.addSubStream(var11);
                        var13.stream2 = var11;
                        var13.field818 = var13.field806 + (int)(Math.random() * (double)(var13.field808 - var13.field806));
                     }
                  }
               } else {
                  var13.stream2.method999(var7);
                  if (!var13.stream2.hasNext()) {
                     var13.stream2 = null;
                  }
               }
            } else {
               if (var13.stream1 != null) {
                  class323.pcmStreamMixer.removeSubStream(var13.stream1);
                  var13.stream1 = null;
               }

               if (var13.stream2 != null) {
                  class323.pcmStreamMixer.removeSubStream(var13.stream2);
                  var13.stream2 = null;
               }
            }
         }
      }

      graphicsCycle = 0;
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      descriptor = "(Lep;II)Z",
      garbageValue = "-468698834"
   )
   boolean method1240(PacketWriter var1, int var2) {
      if (var1.serverPacketLength == 0) {
         ReflectionCheck.friendsChat = null;
      } else {
         if (ReflectionCheck.friendsChat == null) {
            ReflectionCheck.friendsChat = new FriendsChat(Occluder.loginType, class392.client);
         }

         ReflectionCheck.friendsChat.method7479(var1.packetBuffer, var2);
      }

      class31.method445();
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("ju")
   @ObfuscatedSignature(
      descriptor = "(Lep;S)Z",
      garbageValue = "30632"
   )
   boolean method1241(PacketWriter var1) {
      if (ReflectionCheck.friendsChat != null) {
         ReflectionCheck.friendsChat.method7480(var1.packetBuffer);
      }

      class31.method445();
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("jc")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)Z",
      garbageValue = "1828480042"
   )
   final boolean method1652(PacketWriter var1) {
      AbstractSocket var2 = var1.getSocket();
      PacketBuffer var3 = var1.packetBuffer;
      if (var2 == null) {
         return false;
      } else {
         int var21;
         String var24;
         try {
            int var5;
            if (var1.serverPacket == null) {
               if (var1.field1385) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 0, 1);
                  var1.field1383 = 0;
                  var1.field1385 = false;
               }

               var3.offset = 0;
               if (var3.method8565()) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 1, 1);
                  var1.field1383 = 0;
               }

               var1.field1385 = true;
               ServerPacket[] var4 = class258.ServerPacket_values();
               var5 = var3.readSmartByteShortIsaac();
               if (var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.offset);
               }

               var1.serverPacket = var4[var5];
               var1.serverPacketLength = var1.serverPacket.length;
            }

            if (var1.serverPacketLength == -1) {
               if (!var2.isAvailable(1)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 1);
               var1.serverPacketLength = var3.array[0] & 255;
            }

            if (var1.serverPacketLength == -2) {
               if (!var2.isAvailable(2)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 2);
               var3.offset = 0;
               var1.serverPacketLength = var3.readUnsignedShort();
            }

            if (!var2.isAvailable(var1.serverPacketLength)) {
               return false;
            }

            var3.offset = 0;
            var2.read(var3.array, 0, var1.serverPacketLength);
            var1.field1383 = 0;
            timer.method7336();
            var1.field1390 = var1.field1389;
            var1.field1389 = var1.field1388;
            var1.field1388 = var1.serverPacket;
            if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
               class150.method3183(class283.field3156);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3201 == var1.serverPacket) {
               GrandExchangeOfferNameComparator.method6553();
               weight = var3.readShort();
               field686 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3181 == var1.serverPacket) {
               class150.method3183(class283.field3162);
               var1.serverPacket = null;
               return true;
            }

            Widget var6;
            int var20;
            if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedShortAdd();
               var6 = WorldMapSection1.getWidget(var20);
               if (var6 != null && var6.type == 0) {
                  if (var5 > var6.scrollHeight - var6.height) {
                     var5 = var6.scrollHeight - var6.height;
                  }

                  if (var5 < 0) {
                     var5 = 0;
                  }

                  if (var5 != var6.scrollY) {
                     var6.scrollY = var5;
                     class69.invalidateWidget(var6);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3261 == var1.serverPacket) {
               class150.method3183(class283.field3160);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
               class207.privateChatMode = class181.method3544(var3.readUnsignedByte());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
               isCameraLocked = true;
               field737 = false;
               class4.field7 = var3.readUnsignedByte() * 16384;
               WorldMapSectionType.field2937 = var3.readUnsignedByte() * 128;
               class269.field3033 = var3.readUnsignedShort();
               class19.field104 = var3.readUnsignedByte();
               class313.field3676 = var3.readUnsignedByte();
               if (class313.field3676 >= 100) {
                  class381.cameraX = class4.field7 * 128 + 64;
                  class471.cameraZ = WorldMapSectionType.field2937 * 16384 + 64;
                  class351.cameraY = WorldMapDecorationType.getTileHeight(class381.cameraX, class471.cameraZ, TaskHandler.Client_plane) - class269.field3033;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3275 == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               rootInterface = var20;
               this.resizeRoot(false);
               ApproximateRouteStrategy.Widget_resetModelFrames(var20);
               WorldMapSection1.runWidgetOnLoadListener(rootInterface);

               for(var5 = 0; var5 < 100; ++var5) {
                  field722[var5] = true;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               Player.forceDisconnect(var20);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.HINT_ARROW == var1.serverPacket) {
               hintArrowType = var3.readUnsignedByte();
               if (hintArrowType == 1) {
                  hintArrowNpcIndex = var3.readUnsignedShort();
               }

               if (hintArrowType >= 2 && hintArrowType <= 6) {
                  if (hintArrowType == 2) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 3) {
                     hintArrowSubX = 0;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 4) {
                     hintArrowSubX = 8192;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 5) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 0;
                  }

                  if (hintArrowType == 6) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 8192;
                  }

                  hintArrowType = 2;
                  hintArrowX = var3.readUnsignedShort();
                  hintArrowY = var3.readUnsignedShort();
                  hintArrowHeight = var3.readUnsignedByte() * 4;
               }

               if (hintArrowType == 10) {
                  hintArrowPlayerIndex = var3.readUnsignedShort();
               }

               var1.serverPacket = null;
               return true;
            }

            int var8;
            NPC var59;
            if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
               var21 = var3.readUnsignedByteNeg();
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedShortAddLE();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var59 = npcs[var20];
               if (var59 != null) {
                  if (var5 == var59.sequence && var5 != -1) {
                     var8 = Coord.SequenceDefinition_get(var5).field2276;
                     if (var8 == 1) {
                        var59.sequenceFrame = 0;
                        var59.sequenceFrameCycle = 0;
                        var59.sequenceDelay = var21;
                        var59.field1186 = 0;
                     } else if (var8 == 2) {
                        var59.field1186 = 0;
                     }
                  } else if (var5 == -1 || var59.sequence == -1 || Coord.SequenceDefinition_get(var5).field2269 >= Coord.SequenceDefinition_get(var59.sequence).field2269) {
                     var59.sequence = var5;
                     var59.sequenceFrame = 0;
                     var59.sequenceFrameCycle = 0;
                     var59.sequenceDelay = var21;
                     var59.field1186 = 0;
                     var59.field1215 = var59.pathLength;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
               class6.friendSystem.readUpdate(var3, var1.serverPacketLength);
               field701 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            int var22;
            if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
               GrandExchangeOfferNameComparator.method6553();
               var20 = var3.readUnsignedByteAdd();
               var5 = var3.readUnsignedByteAdd();
               var21 = var3.readUnsignedIntIME();
               experience[var20] = var21;
               currentLevels[var20] = var5;
               levels[var20] = 1;

               for(var22 = 0; var22 < 98; ++var22) {
                  if (var21 >= Skills.Skills_experienceTable[var22]) {
                     levels[var20] = var22 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var20;
               var1.serverPacket = null;
               return true;
            }

            byte var84;
            if (ServerPacket.field3177 == var1.serverPacket) {
               field482 = cycleCntr;
               var84 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var84 >= 0) {
                     currentClanChannels[var84] = null;
                  } else {
                     class19.guestClanChannel = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var84 >= 0) {
                  currentClanChannels[var84] = new ClanChannel(var3);
               } else {
                  class19.guestClanChannel = new ClanChannel(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
               var15 = var3.readUnsignedShortAdd();
               var13 = var3.readUnsignedByteAdd() * 4;
               int var17 = var3.readUnsignedByteSub();
               byte var67 = var3.readByteAdd();
               byte var63 = var3.readByteSub();
               var21 = var3.readMedium();
               var20 = var21 >> 16;
               var5 = var21 >> 8 & 255;
               var22 = var20 + (var21 >> 4 & 7);
               var8 = var5 + (var21 & 7);
               var12 = var3.readUnsignedShort();
               int var18 = var3.readUnsignedByteNeg();
               var14 = var3.readUnsignedByte() * 4;
               var11 = var3.method8668();
               var16 = var3.readUnsignedShortAddLE();
               var9 = var67 + var22;
               var10 = var63 + var8;
               if (var22 >= 0 && var8 >= 0 && var22 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) {
                  var22 = var22 * 128 + 64;
                  var8 = var8 * 128 + 64;
                  var9 = var9 * 128 + 64;
                  var10 = var10 * 128 + 64;
                  Projectile var19 = new Projectile(var12, TaskHandler.Client_plane, var22, var8, WorldMapDecorationType.getTileHeight(var22, var8, TaskHandler.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14);
                  var19.setDestination(var9, var10, WorldMapDecorationType.getTileHeight(var9, var10, TaskHandler.Client_plane) - var14, var15 + cycle);
                  projectiles.addFirst(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
                  if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) {
                     Varps.Varps_main[var20] = Varps.Varps_temp[var20];
                     class159.changeGameOptions(var20);
                     changedVarps[++changedVarpCount - 1 & 31] = var20;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
               destinationX = var3.readUnsignedByte();
               if (destinationX == 255) {
                  destinationX = 0;
               }

               destinationY = var3.readUnsignedByte();
               if (destinationY == 255) {
                  destinationY = 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3277 == var1.serverPacket) {
               return this.method1241(var1);
            }

            if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedIntLE();
               var21 = var20 >> 10 & 31;
               var22 = var20 >> 5 & 31;
               var8 = var20 & 31;
               var9 = (var22 << 11) + (var21 << 19) + (var8 << 3);
               Widget var76 = WorldMapSection1.getWidget(var5);
               if (var9 != var76.color) {
                  var76.color = var9;
                  class69.invalidateWidget(var76);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3208 == var1.serverPacket && isCameraLocked) {
               field737 = true;
               class19.field104 = var3.readUnsignedByte();
               class313.field3676 = var3.readUnsignedByte();
               GrandExchangeOfferUnitPriceComparator.field4269 = var3.readUnsignedByte();
               Skeleton.field2505 = var3.readUnsignedByte();

               for(var20 = 0; var20 < 5; ++var20) {
                  field738[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < VarpDefinition.field1890; ++var20) {
                  VarpDefinition var88 = GameEngine.VarpDefinition_get(var20);
                  if (var88 != null) {
                     Varps.Varps_temp[var20] = 0;
                     Varps.Varps_main[var20] = 0;
                  }
               }

               GrandExchangeOfferNameComparator.method6553();
               changedVarpCount += 32;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_SMALL == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               var5 = var3.readUnsignedIntME();
               Varps.Varps_temp[var20] = var5;
               if (Varps.Varps_main[var20] != var5) {
                  Varps.Varps_main[var20] = var5;
               }

               class159.changeGameOptions(var20);
               changedVarps[++changedVarpCount - 1 & 31] = var20;
               var1.serverPacket = null;
               return true;
            }

            Widget var80;
            if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var80 = WorldMapSection1.getWidget(var20);
               var80.modelType = 3;
               var80.modelId = BuddyRankComparator.localPlayer.appearance.getChatHeadId();
               class69.invalidateWidget(var80);
               var1.serverPacket = null;
               return true;
            }

            String var62;
            if (ServerPacket.URL_OPEN == var1.serverPacket) {
               byte[] var57 = new byte[var1.serverPacketLength];
               var3.method8567(var57, 0, var57.length);
               Buffer var87 = new Buffer(var57);
               var62 = var87.readStringCp1252NullTerminated();
               KeyHandler.openURL(var62, true, false);
               var1.serverPacket = null;
               return true;
            }

            Widget var79;
            if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedShort();
               var21 = var3.readUnsignedIntME();
               var22 = var3.readUnsignedShortLE();
               var79 = WorldMapSection1.getWidget(var21);
               if (var20 != var79.modelAngleX || var22 != var79.modelAngleY || var5 != var79.modelZoom) {
                  var79.modelAngleX = var20;
                  var79.modelAngleY = var22;
                  var79.modelZoom = var5;
                  class69.invalidateWidget(var79);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3218 == var1.serverPacket) {
               class279.method5453();
               var84 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var84 >= 0) {
                     currentClanSettings[var84] = null;
                  } else {
                     WorldMapCacheName.guestClanSettings = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var84 >= 0) {
                  currentClanSettings[var84] = new ClanSettings(var3);
               } else {
                  WorldMapCacheName.guestClanSettings = new ClanSettings(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
               class278.logOut();
               var1.serverPacket = null;
               return false;
            }

            boolean var73;
            if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
               var73 = var3.readUnsignedByteAdd() == 1;
               var5 = var3.readInt();
               var6 = WorldMapSection1.getWidget(var5);
               if (var73 != var6.isHidden) {
                  var6.isHidden = var73;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3179 == var1.serverPacket) {
               class150.method3183(class283.field3164);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_LARGE == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               byte var72 = var3.readByte();
               Varps.Varps_temp[var20] = var72;
               if (Varps.Varps_main[var20] != var72) {
                  Varps.Varps_main[var20] = var72;
               }

               class159.changeGameOptions(var20);
               changedVarps[++changedVarpCount - 1 & 31] = var20;
               var1.serverPacket = null;
               return true;
            }

            String var52;
            if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
               var52 = var3.readStringCp1252NullTerminated();
               var5 = var3.readUnsignedByteAdd();
               var21 = var3.readUnsignedByte();
               if (var5 >= 1 && var5 <= 8) {
                  if (var52.equalsIgnoreCase("null")) {
                     var52 = null;
                  }

                  playerMenuActions[var5 - 1] = var52;
                  playerOptionsPriorities[var5 - 1] = var21 == 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               class377.method7139(var20);
               changedItemContainers[++field666 - 1 & 31] = var20 & 32767;
               var1.serverPacket = null;
               return true;
            }

            long var26;
            long var28;
            long var30;
            long var33;
            String var35;
            if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
               var52 = var3.readStringCp1252NullTerminated();
               var26 = var3.readLong();
               var28 = (long)var3.readUnsignedShort();
               var30 = (long)var3.readMedium();
               PlayerType var90 = (PlayerType)SpriteMask.findEnumerated(class211.PlayerType_values(), var3.readUnsignedByte());
               var33 = (var28 << 32) + var30;
               boolean var71 = false;

               for(var15 = 0; var15 < 100; ++var15) {
                  if (crossWorldMessageIds[var15] == var33) {
                     var71 = true;
                     break;
                  }
               }

               if (var90.isUser && class6.friendSystem.isIgnored(new Username(var52, Occluder.loginType))) {
                  var71 = true;
               }

               if (!var71 && field667 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var33;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var35 = AbstractFont.escapeBrackets(class33.method471(class279.method5452(var3)));
                  if (var90.modIcon != -1) {
                     class12.addChatMessage(9, class7.method53(var90.modIcon) + var52, var35, GrandExchangeOffer.base37DecodeLong(var26));
                  } else {
                     class12.addChatMessage(9, var52, var35, GrandExchangeOffer.base37DecodeLong(var26));
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3260 == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               var5 = var3.readUnsignedByteAdd();
               var21 = var3.readUnsignedIntIME();
               short var89 = (short)var3.method8676();
               NPC var85 = npcs[var20];
               if (var85 != null) {
                  var85.method2562(var5, var21, var89);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
               var52 = var3.readStringCp1252NullTerminated();
               var24 = AbstractFont.escapeBrackets(class33.method471(class279.method5452(var3)));
               MusicPatchNode.addGameMessage(6, var52, var24);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
               Skeleton.loadRegions(false, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            GameObject var42;
            if (ServerPacket.field3246 == var1.serverPacket) {
               var84 = var3.readByte();
               var24 = var3.readStringCp1252NullTerminated();
               long var36 = (long)var3.readUnsignedShort();
               long var38 = (long)var3.readMedium();
               PlayerType var74 = (PlayerType)SpriteMask.findEnumerated(class211.PlayerType_values(), var3.readUnsignedByte());
               long var40 = var38 + (var36 << 32);
               boolean var69 = false;
               var42 = null;
               ClanChannel var94 = var84 >= 0 ? currentClanChannels[var84] : class19.guestClanChannel;
               if (var94 == null) {
                  var69 = true;
               } else {
                  var15 = 0;

                  while(true) {
                     if (var15 >= 100) {
                        if (var74.isUser && class6.friendSystem.isIgnored(new Username(var24, Occluder.loginType))) {
                           var69 = true;
                        }
                        break;
                     }

                     if (var40 == crossWorldMessageIds[var15]) {
                        var69 = true;
                        break;
                     }

                     ++var15;
                  }
               }

               if (!var69) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var40;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var35 = AbstractFont.escapeBrackets(class279.method5452(var3));
                  var16 = var84 >= 0 ? 41 : 44;
                  if (var74.modIcon != -1) {
                     class12.addChatMessage(var16, class7.method53(var74.modIcon) + var24, var35, var94.name);
                  } else {
                     class12.addChatMessage(var16, var24, var35, var94.name);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3237 == var1.serverPacket) {
               class279.method5453();
               var84 = var3.readByte();
               class143 var82 = new class143(var3);
               ClanSettings var66;
               if (var84 >= 0) {
                  var66 = currentClanSettings[var84];
               } else {
                  var66 = WorldMapCacheName.guestClanSettings;
               }

               var82.method3126(var66);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3225 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var21 = var3.readUnsignedByte();
               var22 = var3.readUnsignedByte();
               field738[var20] = true;
               field739[var20] = var5;
               field680[var20] = var21;
               field741[var20] = var22;
               field566[var20] = 0;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3267 == var1.serverPacket) {
               var20 = var3.readInt();
               if (var20 != field575) {
                  field575 = var20;
                  Varcs.method2724();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3278 == var1.serverPacket) {
               class188.field1958 = null;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
               class6.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
               Message.FriendSystem_invalidateIgnoreds();
               field701 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
               minimapState = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
               var20 = var3.readInt();
               InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var20);
               if (var81 != null) {
                  class17.closeInterface(var81, true);
               }

               if (meslayerContinueWidget != null) {
                  class69.invalidateWidget(meslayerContinueWidget);
                  meslayerContinueWidget = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               if (var3.readUnsignedByte() == 0) {
                  grandExchangeOffers[var20] = new GrandExchangeOffer();
                  var3.offset += 18;
               } else {
                  --var3.offset;
                  grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
               }

               field643 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3194 == var1.serverPacket) {
               ApproximateRouteStrategy.method1202(var3.readStringCp1252NullTerminated());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_RESET == var1.serverPacket) {
               isCameraLocked = false;

               for(var20 = 0; var20 < 5; ++var20) {
                  field738[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3249 == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readInt();
               var6 = WorldMapSection1.getWidget(var5);
               if (var6.modelType != 6 || var20 != var6.modelId) {
                  var6.modelType = 6;
                  var6.modelId = var20;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readInt();
               var21 = class105.getGcDuration();
               PacketBufferNode var60 = UserComparator9.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
               var60.packetBuffer.writeIntME(var20);
               var60.packetBuffer.writeIntIME(var5);
               var60.packetBuffer.writeByte(var21);
               var60.packetBuffer.writeByteNeg(GameEngine.fps);
               packetWriter.addNode(var60);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3185 == var1.serverPacket) {
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
               rebootTimer = var3.readUnsignedShortAddLE() * 30;
               field686 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShortAdd();
               var6 = WorldMapSection1.getWidget(var20);
               if (var6.modelType != 1 || var5 != var6.modelId) {
                  var6.modelType = 1;
                  var6.modelId = var5;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
               var21 = var3.readUnsignedShort();
               var5 = var3.readUnsignedIntME();
               var20 = var3.readUnsignedShortAdd();
               var59 = npcs[var20];
               if (var59 != null) {
                  var59.spotAnimation = var21;
                  var59.spotAnimationHeight = var5 >> 16;
                  var59.field1190 = (var5 & '\uffff') + cycle;
                  var59.spotAnimationFrame = 0;
                  var59.spotAnimationFrameCycle = 0;
                  if (var59.field1190 > cycle) {
                     var59.spotAnimationFrame = -1;
                  }

                  if (var59.spotAnimation == 65535) {
                     var59.spotAnimation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3227 == var1.serverPacket) {
               var20 = var3.readUShortSmart();
               boolean var70 = var3.readUnsignedByte() == 1;
               var62 = "";
               boolean var86 = false;
               if (var70) {
                  var62 = var3.readStringCp1252NullTerminated();
                  if (class6.friendSystem.isIgnored(new Username(var62, Occluder.loginType))) {
                     var86 = true;
                  }
               }

               String var83 = var3.readStringCp1252NullTerminated();
               if (!var86) {
                  MusicPatchNode.addGameMessage(var20, var62, var83);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3223 == var1.serverPacket) {
               class6.friendSystem.method1836();
               field701 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3174 == var1.serverPacket) {
               if (class188.field1958 == null) {
                  class188.field1958 = new class425(Messages.HitSplatDefinition_cached);
               }

               class486 var53 = Messages.HitSplatDefinition_cached.method7939(var3);
               class188.field1958.field4634.vmethod8322(var53.field4967, var53.field4966);
               field677[++field678 - 1 & 31] = var53.field4967;
               var1.serverPacket = null;
               return true;
            }

            InterfaceParent var56;
            if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var5 = var3.readUnsignedIntIME();
               InterfaceParent var61 = (InterfaceParent)interfaceParents.get((long)var20);
               var56 = (InterfaceParent)interfaceParents.get((long)var5);
               if (var56 != null) {
                  class17.closeInterface(var56, var61 == null || var61.group != var56.group);
               }

               if (var61 != null) {
                  var61.remove();
                  interfaceParents.put(var61, (long)var5);
               }

               var79 = WorldMapSection1.getWidget(var20);
               if (var79 != null) {
                  class69.invalidateWidget(var79);
               }

               var79 = WorldMapSection1.getWidget(var5);
               if (var79 != null) {
                  class69.invalidateWidget(var79);
                  class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var79.id >>> 16], var79, true);
               }

               if (rootInterface != -1) {
                  NPCComposition.runIntfCloseListeners(rootInterface, 1);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
               class148.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3199 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               StructComposition.method3815(var20);
               var1.serverPacket = null;
               return true;
            }

            String var46;
            if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
               var52 = var3.readStringCp1252NullTerminated();
               var26 = (long)var3.readUnsignedShort();
               var28 = (long)var3.readMedium();
               PlayerType var43 = (PlayerType)SpriteMask.findEnumerated(class211.PlayerType_values(), var3.readUnsignedByte());
               long var44 = var28 + (var26 << 32);
               boolean var64 = false;

               for(var13 = 0; var13 < 100; ++var13) {
                  if (var44 == crossWorldMessageIds[var13]) {
                     var64 = true;
                     break;
                  }
               }

               if (class6.friendSystem.isIgnored(new Username(var52, Occluder.loginType))) {
                  var64 = true;
               }

               if (!var64 && field667 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var44;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var46 = AbstractFont.escapeBrackets(class33.method471(class279.method5452(var3)));
                  byte var68;
                  if (var43.isPrivileged) {
                     var68 = 7;
                  } else {
                     var68 = 3;
                  }

                  if (var43.modIcon != -1) {
                     MusicPatchNode.addGameMessage(var68, class7.method53(var43.modIcon) + var52, var46);
                  } else {
                     MusicPatchNode.addGameMessage(var68, var52, var46);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
               publicChatMode = var3.readUnsignedByteAdd();
               tradeChatMode = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
               if (rootInterface != -1) {
                  NPCComposition.runIntfCloseListeners(rootInterface, 0);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
               WorldMapSprite.updatePlayers(var3, var1.serverPacketLength);
               class462.method8434();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3215 == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var21 = var3.readUnsignedShort();
               Skills.queueSoundEffect(var20, var5, var21);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
               class148.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3221 == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedIntLE();
               var21 = var3.readUnsignedShortAdd();
               if (var21 == 65535) {
                  var21 = -1;
               }

               var22 = var3.readUnsignedShortAddLE();
               if (var22 == 65535) {
                  var22 = -1;
               }

               for(var8 = var21; var8 <= var22; ++var8) {
                  var30 = ((long)var20 << 32) + (long)var8;
                  Node var32 = widgetFlags.get(var30);
                  if (var32 != null) {
                     var32.remove();
                  }

                  widgetFlags.put(new IntegerNode(var5), var30);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3232 == var1.serverPacket) {
               class149.field1677 = var3.readUnsignedByteSub();
               class283.field3165 = var3.readUnsignedByteSub();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
               var3.offset += 28;
               if (var3.checkCrc()) {
                  class17.method255(var3, var3.offset - 28);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var20 < -70000) {
                  var5 += 32768;
               }

               if (var20 >= 0) {
                  var6 = WorldMapSection1.getWidget(var20);
               } else {
                  var6 = null;
               }

               for(; var3.offset < var1.serverPacketLength; UserComparator3.itemContainerSetItem(var5, var22, var8 - 1, var9)) {
                  var22 = var3.readUShortSmart();
                  var8 = var3.readUnsignedShort();
                  var9 = 0;
                  if (var8 != 0) {
                     var9 = var3.readUnsignedByte();
                     if (var9 == 255) {
                        var9 = var3.readInt();
                     }
                  }

                  if (var6 != null && var22 >= 0 && var22 < var6.itemIds.length) {
                     var6.itemIds[var22] = var8;
                     var6.itemQuantities[var22] = var9;
                  }
               }

               if (var6 != null) {
                  class69.invalidateWidget(var6);
               }

               GrandExchangeOfferNameComparator.method6553();
               changedItemContainers[++field666 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var80 = WorldMapSection1.getWidget(var20);

               for(var21 = 0; var21 < var80.itemIds.length; ++var21) {
                  var80.itemIds[var21] = -1;
                  var80.itemIds[var21] = 0;
               }

               class69.invalidateWidget(var80);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3255 == var1.serverPacket) {
               class150.method3183(class283.field3154);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3187 == var1.serverPacket) {
               var84 = var3.readByte();
               var26 = (long)var3.readUnsignedShort();
               var28 = (long)var3.readMedium();
               var30 = var28 + (var26 << 32);
               boolean var65 = false;
               ClanChannel var95 = var84 >= 0 ? currentClanChannels[var84] : class19.guestClanChannel;
               if (var95 == null) {
                  var65 = true;
               } else {
                  for(var13 = 0; var13 < 100; ++var13) {
                     if (crossWorldMessageIds[var13] == var30) {
                        var65 = true;
                        break;
                     }
                  }
               }

               if (!var65) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var30;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var46 = class279.method5452(var3);
                  var14 = var84 >= 0 ? 43 : 46;
                  class12.addChatMessage(var14, "", var46, var95.name);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3180 == var1.serverPacket) {
               class150.method3183(class283.field3161);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3192 == var1.serverPacket) {
               return this.method1240(var1, 1);
            }

            if (ServerPacket.field3239 == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.method8676();
               var6 = WorldMapSection1.getWidget(var20);
               if (var5 != var6.sequenceId || var5 == -1) {
                  var6.sequenceId = var5;
                  var6.modelFrame = 0;
                  var6.modelFrameCycle = 0;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3262 == var1.serverPacket) {
               class150.method3183(class283.field3159);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
               class154.readReflectionCheck(var3, var1.serverPacketLength);
               var1.serverPacket = null;
               return true;
            }

            Widget var7;
            if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedIntME();
               var21 = var3.readUnsignedShort();
               if (var21 == 65535) {
                  var21 = -1;
               }

               var7 = WorldMapSection1.getWidget(var20);
               ItemComposition var25;
               if (!var7.isIf3) {
                  if (var21 == -1) {
                     var7.modelType = 0;
                     var1.serverPacket = null;
                     return true;
                  }

                  var25 = ParamComposition.ItemDefinition_get(var21);
                  var7.modelType = 4;
                  var7.modelId = var21;
                  var7.modelAngleX = var25.xan2d;
                  var7.modelAngleY = var25.yan2d;
                  var7.modelZoom = var25.zoom2d * 100 / var5;
                  class69.invalidateWidget(var7);
               } else {
                  var7.itemId = var21;
                  var7.itemQuantity = var5;
                  var25 = ParamComposition.ItemDefinition_get(var21);
                  var7.modelAngleX = var25.xan2d;
                  var7.modelAngleY = var25.yan2d;
                  var7.modelAngleZ = var25.zan2d;
                  var7.modelOffsetX = var25.offsetX2d;
                  var7.modelOffsetY = var25.offsetY2d;
                  var7.modelZoom = var25.zoom2d;
                  if (var25.isStackable == 1) {
                     var7.itemQuantityMode = 1;
                  } else {
                     var7.itemQuantityMode = 2;
                  }

                  if (var7.field3532 > 0) {
                     var7.modelZoom = var7.modelZoom * 32 / var7.field3532;
                  } else if (var7.rawWidth > 0) {
                     var7.modelZoom = var7.modelZoom * 32 / var7.rawWidth;
                  }

                  class69.invalidateWidget(var7);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3217 == var1.serverPacket) {
               var73 = var3.readUnsignedByte() == 1;
               if (var73) {
                  GrandExchangeOfferWorldComparator.field4254 = WorldMapSection2.method4844() - var3.readLong();
                  Projectile.grandExchangeEvents = new GrandExchangeEvents(var3, true);
               } else {
                  Projectile.grandExchangeEvents = null;
               }

               field685 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
               var10 = var3.readUnsignedByte();
               var11 = var3.readUnsignedShortLE();
               var21 = var3.readMedium();
               var20 = var21 >> 16;
               var5 = var21 >> 8 & 255;
               var22 = var20 + (var21 >> 4 & 7);
               var8 = var5 + (var21 & 7);
               var9 = var3.readUnsignedShortLE();
               if (var22 >= 0 && var8 >= 0 && var22 < 104 && var8 < 104) {
                  var22 = var22 * 128 + 64;
                  var8 = var8 * 128 + 64;
                  GraphicsObject var47 = new GraphicsObject(var9, TaskHandler.Client_plane, var22, var8, WorldMapDecorationType.getTileHeight(var22, var8, TaskHandler.Client_plane) - var10, var11, cycle);
                  graphicsObjects.addFirst(var47);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               var5 = var3.readUnsignedIntIME();
               var6 = WorldMapSection1.getWidget(var5);
               if (var6.modelType != 2 || var20 != var6.modelId) {
                  var6.modelType = 2;
                  var6.modelId = var20;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3206 == var1.serverPacket) {
               var20 = var3.readUnsignedByteNeg();
               var5 = var3.readInt();
               var21 = var3.readUnsignedShortLE();
               var56 = (InterfaceParent)interfaceParents.get((long)var5);
               if (var56 != null) {
                  class17.closeInterface(var56, var21 != var56.group);
               }

               DynamicObject.method2142(var5, var21, var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3274 == var1.serverPacket) {
               field482 = cycleCntr;
               var84 = var3.readByte();
               class157 var78 = new class157(var3);
               ClanChannel var55;
               if (var84 >= 0) {
                  var55 = currentClanChannels[var84];
               } else {
                  var55 = class19.guestClanChannel;
               }

               var78.method3303(var55);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MIDI_SONG == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               if (var20 == 65535) {
                  var20 = -1;
               }

               Language.playSong(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3188 == var1.serverPacket) {
               var20 = var3.readMedium();
               var5 = var3.readUnsignedShortLE();
               if (var5 == 65535) {
                  var5 = -1;
               }

               class19.method278(var5, var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
               class283.field3165 = var3.readUnsignedByteNeg();
               class149.field1677 = var3.readUnsignedByte();

               while(var3.offset < var1.serverPacketLength) {
                  var20 = var3.readUnsignedByte();
                  class283 var77 = class208.method4111()[var20];
                  class150.method3183(var77);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
               var52 = var3.readStringCp1252NullTerminated();
               Object[] var75 = new Object[var52.length() + 1];

               for(var21 = var52.length() - 1; var21 >= 0; --var21) {
                  if (var52.charAt(var21) == 's') {
                     var75[var21 + 1] = var3.readStringCp1252NullTerminated();
                  } else {
                     var75[var21 + 1] = new Integer(var3.readInt());
                  }
               }

               var75[0] = new Integer(var3.readInt());
               ScriptEvent var54 = new ScriptEvent();
               var54.args = var75;
               class9.runScriptEvent(var54);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               Player var58;
               if (var20 == localPlayerIndex) {
                  var58 = BuddyRankComparator.localPlayer;
               } else {
                  var58 = players[var20];
               }

               var5 = var3.readUnsignedShort();
               var21 = var3.readUnsignedIntLE();
               if (var58 != null) {
                  var58.spotAnimation = var5;
                  var58.spotAnimationHeight = var21 >> 16;
                  var58.field1190 = (var21 & '\uffff') + cycle;
                  var58.spotAnimationFrame = 0;
                  var58.spotAnimationFrameCycle = 0;
                  if (var58.field1190 > cycle) {
                     var58.spotAnimationFrame = -1;
                  }

                  if (var58.spotAnimation == 65535) {
                     var58.spotAnimation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3189 == var1.serverPacket) {
               return this.method1240(var1, 2);
            }

            if (ServerPacket.field3196 == var1.serverPacket) {
               for(var20 = 0; var20 < players.length; ++var20) {
                  if (players[var20] != null) {
                     players[var20].sequence = -1;
                  }
               }

               for(var20 = 0; var20 < npcs.length; ++var20) {
                  if (npcs[var20] != null) {
                     npcs[var20].sequence = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var20 < -70000) {
                  var5 += 32768;
               }

               if (var20 >= 0) {
                  var6 = WorldMapSection1.getWidget(var20);
               } else {
                  var6 = null;
               }

               if (var6 != null) {
                  for(var22 = 0; var22 < var6.itemIds.length; ++var22) {
                     var6.itemIds[var22] = 0;
                     var6.itemQuantities[var22] = 0;
                  }
               }

               TileItem.clearItemContainer(var5);
               var22 = var3.readUnsignedShort();

               for(var8 = 0; var8 < var22; ++var8) {
                  var9 = var3.readUnsignedByte();
                  if (var9 == 255) {
                     var9 = var3.readUnsignedIntLE();
                  }

                  var10 = var3.readUnsignedShortLE();
                  if (var6 != null && var8 < var6.itemIds.length) {
                     var6.itemIds[var8] = var10;
                     var6.itemQuantities[var8] = var9;
                  }

                  UserComparator3.itemContainerSetItem(var5, var8, var10 - 1, var9);
               }

               if (var6 != null) {
                  class69.invalidateWidget(var6);
               }

               GrandExchangeOfferNameComparator.method6553();
               changedItemContainers[++field666 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3224 == var1.serverPacket) {
               class150.method3183(class283.field3163);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
               var13 = var3.readUnsignedShortAddLE();
               var9 = var3.readUnsignedByte();
               var10 = var9 >> 2;
               var11 = var9 & 3;
               var12 = field554[var10];
               var21 = var3.method8629();
               var20 = var21 >> 16;
               var5 = var21 >> 8 & 255;
               var22 = var20 + (var21 >> 4 & 7);
               var8 = var5 + (var21 & 7);
               if (var22 >= 0 && var8 >= 0 && var22 < 103 && var8 < 103) {
                  if (var12 == 0) {
                     BoundaryObject var93 = class1.scene.method4408(TaskHandler.Client_plane, var22, var8);
                     if (var93 != null) {
                        var15 = class279.Entity_unpackID(var93.tag);
                        if (var10 == 2) {
                           var93.renderable1 = new DynamicObject(var15, 2, var11 + 4, TaskHandler.Client_plane, var22, var8, var13, false, var93.renderable1);
                           var93.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, TaskHandler.Client_plane, var22, var8, var13, false, var93.renderable2);
                        } else {
                           var93.renderable1 = new DynamicObject(var15, var10, var11, TaskHandler.Client_plane, var22, var8, var13, false, var93.renderable1);
                        }
                     }
                  } else if (var12 == 1) {
                     WallDecoration var92 = class1.scene.method4409(TaskHandler.Client_plane, var22, var8);
                     if (var92 != null) {
                        var15 = class279.Entity_unpackID(var92.tag);
                        if (var10 != 4 && var10 != 5) {
                           if (var10 == 6) {
                              var92.renderable1 = new DynamicObject(var15, 4, var11 + 4, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable1);
                           } else if (var10 == 7) {
                              var92.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable1);
                           } else if (var10 == 8) {
                              var92.renderable1 = new DynamicObject(var15, 4, var11 + 4, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable1);
                              var92.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable2);
                           }
                        } else {
                           var92.renderable1 = new DynamicObject(var15, 4, var11, TaskHandler.Client_plane, var22, var8, var13, false, var92.renderable1);
                        }
                     }
                  } else if (var12 == 2) {
                     var42 = class1.scene.getGameObject(TaskHandler.Client_plane, var22, var8);
                     if (var10 == 11) {
                        var10 = 10;
                     }

                     if (var42 != null) {
                        var42.renderable = new DynamicObject(class279.Entity_unpackID(var42.tag), var10, var11, TaskHandler.Client_plane, var22, var8, var13, false, var42.renderable);
                     }
                  } else if (var12 == 3) {
                     FloorDecoration var91 = class1.scene.getFloorDecoration(TaskHandler.Client_plane, var22, var8);
                     if (var91 != null) {
                        var91.renderable = new DynamicObject(class279.Entity_unpackID(var91.tag), 22, var11, TaskHandler.Client_plane, var22, var8, var13, false, var91.renderable);
                     }
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
               Skeleton.loadRegions(true, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3216 == var1.serverPacket) {
               var73 = var3.readBoolean();
               if (var73) {
                  if (Language.field4294 == null) {
                     Language.field4294 = new class350();
                  }
               } else {
                  Language.field4294 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3230 == var1.serverPacket) {
               GrandExchangeOfferNameComparator.method6553();
               runEnergy = var3.readUnsignedShort();
               field686 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3272 == var1.serverPacket) {
               var52 = var3.readStringCp1252NullTerminated();
               var5 = var3.readUnsignedIntIME();
               var6 = WorldMapSection1.getWidget(var5);
               if (!var52.equals(var6.text)) {
                  var6.text = var52;
                  class69.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3211 == var1.serverPacket) {
               var20 = var3.offset + var1.serverPacketLength;
               var5 = var3.readUnsignedShort();
               var21 = var3.readUnsignedShort();
               if (var5 != rootInterface) {
                  rootInterface = var5;
                  this.resizeRoot(false);
                  ApproximateRouteStrategy.Widget_resetModelFrames(rootInterface);
                  WorldMapSection1.runWidgetOnLoadListener(rootInterface);

                  for(var22 = 0; var22 < 100; ++var22) {
                     field722[var22] = true;
                  }
               }

               InterfaceParent var23;
               for(; var21-- > 0; var23.field1042 = true) {
                  var22 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedByte();
                  var23 = (InterfaceParent)interfaceParents.get((long)var22);
                  if (var23 != null && var8 != var23.group) {
                     class17.closeInterface(var23, true);
                     var23 = null;
                  }

                  if (var23 == null) {
                     var23 = DynamicObject.method2142(var22, var8, var9);
                  }
               }

               for(var56 = (InterfaceParent)interfaceParents.first(); var56 != null; var56 = (InterfaceParent)interfaceParents.next()) {
                  if (var56.field1042) {
                     var56.field1042 = false;
                  } else {
                     class17.closeInterface(var56, true);
                  }
               }

               widgetFlags = new NodeHashTable(512);

               while(var3.offset < var20) {
                  var22 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedShort();
                  var10 = var3.readInt();

                  for(var11 = var8; var11 <= var9; ++var11) {
                     var33 = (long)var11 + ((long)var22 << 32);
                     widgetFlags.put(new IntegerNode(var10), var33);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3214 == var1.serverPacket) {
               class150.method3183(class283.field3158);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var5 = var3.readShortLE();
               var21 = var3.readShort();
               var7 = WorldMapSection1.getWidget(var20);
               if (var5 != var7.rawX || var21 != var7.rawY || var7.xAlignment != 0 || var7.yAlignment != 0) {
                  var7.rawX = var5;
                  var7.rawY = var21;
                  var7.xAlignment = 0;
                  var7.yAlignment = 0;
                  class69.invalidateWidget(var7);
                  this.alignWidget(var7);
                  if (var7.type == 0) {
                     class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var20 >> 16], var7, false);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3233 == var1.serverPacket) {
               class188.field1958 = new class425(Messages.HitSplatDefinition_cached);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3203 == var1.serverPacket) {
               class150.method3183(class283.field3157);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
               World var51 = new World();
               var51.host = var3.readStringCp1252NullTerminated();
               var51.id = var3.readUnsignedShort();
               var5 = var3.readInt();
               var51.properties = var5;
               class19.updateGameState(45);
               var2.close();
               var2 = null;
               VarbitComposition.changeWorld(var51);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
               isCameraLocked = true;
               field737 = false;
               class167.field1800 = var3.readUnsignedByte() * 128;
               Canvas.field123 = var3.readUnsignedByte() * 128;
               MidiPcmStream.field3361 = var3.readUnsignedShort();
               GrandExchangeOfferUnitPriceComparator.field4269 = var3.readUnsignedByte();
               Skeleton.field2505 = var3.readUnsignedByte();
               if (Skeleton.field2505 >= 100) {
                  var20 = class167.field1800 * 16384 + 64;
                  var5 = Canvas.field123 * 16384 + 64;
                  var21 = WorldMapDecorationType.getTileHeight(var20, var5, TaskHandler.Client_plane) - MidiPcmStream.field3361;
                  var22 = var20 - class381.cameraX;
                  var8 = var21 - class351.cameraY;
                  var9 = var5 - class471.cameraZ;
                  var10 = (int)Math.sqrt((double)(var9 * var9 + var22 * var22));
                  class311.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531) & 2047;
                  class110.cameraYaw = (int)(Math.atan2((double)var22, (double)var9) * -325.9490051269531) & 2047;
                  if (class311.cameraPitch < 128) {
                     class311.cameraPitch = 128;
                  }

                  if (class311.cameraPitch > 383) {
                     class311.cameraPitch = 383;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3270 == var1.serverPacket) {
               class150.method3183(class283.field3155);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
               class283.field3165 = var3.readUnsignedByteNeg();
               class149.field1677 = var3.readUnsignedByte();

               for(var20 = class283.field3165; var20 < class283.field3165 + 8; ++var20) {
                  for(var5 = class149.field1677; var5 < class149.field1677 + 8; ++var5) {
                     if (groundItems[TaskHandler.Client_plane][var20][var5] != null) {
                        groundItems[TaskHandler.Client_plane][var20][var5] = null;
                        class148.updateItemPile(var20, var5);
                     }
                  }
               }

               for(PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
                  if (var50.x >= class283.field3165 && var50.x < class283.field3165 + 8 && var50.y >= class149.field1677 && var50.y < class149.field1677 + 8 && var50.plane == TaskHandler.Client_plane) {
                     var50.hitpoints = 0;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3205 == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedShortAdd();
               var21 = var3.readInt();
               var7 = WorldMapSection1.getWidget(var21);
               var7.field3582 = var20 + (var5 << 16);
               var1.serverPacket = null;
               return true;
            }

            class364.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1389 != null ? var1.field1389.id : -1) + "," + (var1.field1390 != null ? var1.field1390.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
            class278.logOut();
         } catch (IOException var48) {
            PendingSpawn.method2350();
         } catch (Exception var49) {
            var24 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1389 != null ? var1.field1389.id : -1) + "," + (var1.field1390 != null ? var1.field1390.id : -1) + "," + var1.serverPacketLength + "," + (BuddyRankComparator.localPlayer.pathX[0] + GameEngine.baseX * 64) + "," + (BuddyRankComparator.localPlayer.pathY[0] + class178.baseY * 64) + ",";

            for(var21 = 0; var21 < var1.serverPacketLength && var21 < 50; ++var21) {
               var24 = var24 + var3.array[var21] + ",";
            }

            class364.RunException_sendStackTrace(var24, var49);
            class278.logOut();
         }

         return true;
      }
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-88"
   )
   @Export("menu")
   final void menu() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
            if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
               String var10 = menuTargets[var2];
               menuTargets[var2] = menuTargets[var2 + 1];
               menuTargets[var2 + 1] = var10;
               String var11 = menuActions[var2];
               menuActions[var2] = menuActions[var2 + 1];
               menuActions[var2 + 1] = var11;
               var5 = menuOpcodes[var2];
               menuOpcodes[var2] = menuOpcodes[var2 + 1];
               menuOpcodes[var2 + 1] = var5;
               var5 = menuArguments1[var2];
               menuArguments1[var2] = menuArguments1[var2 + 1];
               menuArguments1[var2 + 1] = var5;
               var5 = menuArguments2[var2];
               menuArguments2[var2] = menuArguments2[var2 + 1];
               menuArguments2[var2 + 1] = var5;
               var5 = menuIdentifiers[var2];
               menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
               menuIdentifiers[var2 + 1] = var5;
               var5 = menuItemIds[var2];
               menuItemIds[var2] = menuItemIds[var2 + 1];
               menuItemIds[var2 + 1] = var5;
               boolean var6 = menuShiftClick[var2];
               menuShiftClick[var2] = menuShiftClick[var2 + 1];
               menuShiftClick[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if (clickedWidget == null) {
         int var12 = MouseHandler.MouseHandler_lastButton;
         if (isMenuOpen) {
            int var3;
            if (var12 != 1 && (class319.mouseCam || var12 != 4)) {
               var2 = MouseHandler.MouseHandler_x;
               var3 = MouseHandler.MouseHandler_y;
               if (var2 < class20.menuX - 10 || var2 > PacketWriter.menuWidth + class20.menuX + 10 || var3 < Login.menuY - 10 || var3 > class30.menuHeight + Login.menuY + 10) {
                  isMenuOpen = false;
                  class167.invalidateMenu(class20.menuX, Login.menuY, PacketWriter.menuWidth, class30.menuHeight);
               }
            }

            if (var12 == 1 || !class319.mouseCam && var12 == 4) {
               var2 = class20.menuX;
               var3 = Login.menuY;
               int var4 = PacketWriter.menuWidth;
               var5 = MouseHandler.MouseHandler_lastPressedX;
               int var13 = MouseHandler.MouseHandler_lastPressedY;
               int var7 = -1;

               for(int var8 = 0; var8 < menuOptionsCount; ++var8) {
                  int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
                  if (var5 > var2 && var5 < var2 + var4 && var13 > var9 - 13 && var13 < var9 + 3) {
                     var7 = var8;
                  }
               }

               if (var7 != -1) {
                  ScriptFrame.createMenuAction(var7);
               }

               isMenuOpen = false;
               class167.invalidateMenu(class20.menuX, Login.menuY, PacketWriter.menuWidth, class30.menuHeight);
            }
         } else {
            var2 = menuOptionsCount - 1;
            if ((var12 == 1 || !class319.mouseCam && var12 == 4) && this.shouldLeftClickOpenMenu()) {
               var12 = 2;
            }

            if ((var12 == 1 || !class319.mouseCam && var12 == 4) && menuOptionsCount > 0) {
               ScriptFrame.createMenuAction(var2);
            }

            if (var12 == 2 && menuOptionsCount > 0) {
               this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
            }
         }

      }
   }

   @ObfuscatedName("jn")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1492880114"
   )
   @Export("shouldLeftClickOpenMenu")
   final boolean shouldLeftClickOpenMenu() {
      int var1 = menuOptionsCount - 1;
      return (leftClickOpensMenu && menuOptionsCount > 2 || WorldMapData_0.method4790(var1)) && !menuShiftClick[var1];
   }

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1260391802"
   )
   @Export("openMenu")
   final void openMenu(int var1, int var2) {
      class383.method7318(var1, var2);
      var1 -= viewportOffsetX;
      var2 -= viewportOffsetY;
      class1.scene.menuOpen(TaskHandler.Client_plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-849310357"
   )
   @Export("resizeRoot")
   final void resizeRoot(boolean var1) {
      int var2 = rootInterface;
      int var3 = GameEngine.canvasWidth;
      int var4 = class143.canvasHeight;
      if (GrandExchangeEvent.loadInterface(var2)) {
         Script.resizeInterface(class155.Widget_interfaceComponents[var2], -1, var3, var4, var1);
      }

   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)V",
      garbageValue = "1931780261"
   )
   @Export("alignWidget")
   void alignWidget(Widget var1) {
      Widget var2 = var1.parentId == -1 ? null : WorldMapSection1.getWidget(var1.parentId);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = GameEngine.canvasWidth;
         var4 = class143.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      PcmPlayer.alignWidgetSize(var1, var3, var4, false);
      Tiles.alignWidgetPosition(var1, var3, var4);
   }

   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "109"
   )
   final void method1248() {
      class69.invalidateWidget(clickedWidget);
      ++class371.widgetDragDuration;
      int var1;
      int var2;
      if (field771 && field663) {
         var1 = MouseHandler.MouseHandler_x;
         var2 = MouseHandler.MouseHandler_y;
         var1 -= widgetClickX;
         var2 -= widgetClickY;
         if (var1 < field664) {
            var1 = field664;
         }

         if (var1 + clickedWidget.width > field664 + clickedWidgetParent.width) {
            var1 = field664 + clickedWidgetParent.width - clickedWidget.width;
         }

         if (var2 < field597) {
            var2 = field597;
         }

         if (var2 + clickedWidget.height > field597 + clickedWidgetParent.height) {
            var2 = field597 + clickedWidgetParent.height - clickedWidget.height;
         }

         int var3 = var1 - field572;
         int var4 = var2 - field668;
         int var5 = clickedWidget.dragZoneSize;
         if (class371.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            isDraggingWidget = true;
         }

         int var6 = var1 - field664 + clickedWidgetParent.scrollX;
         int var7 = var2 - field597 + clickedWidgetParent.scrollY;
         ScriptEvent var8;
         if (clickedWidget.onDrag != null && isDraggingWidget) {
            var8 = new ScriptEvent();
            var8.widget = clickedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.args = clickedWidget.onDrag;
            class9.runScriptEvent(var8);
         }

         if (MouseHandler.MouseHandler_currentButton == 0) {
            if (isDraggingWidget) {
               if (clickedWidget.onDragComplete != null) {
                  var8 = new ScriptEvent();
                  var8.widget = clickedWidget;
                  var8.mouseX = var6;
                  var8.mouseY = var7;
                  var8.dragTarget = draggedOnWidget;
                  var8.args = clickedWidget.onDragComplete;
                  class9.runScriptEvent(var8);
               }

               if (draggedOnWidget != null && class287.method5477(clickedWidget) != null) {
                  PacketBufferNode var11 = UserComparator9.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
                  var11.packetBuffer.writeIntLE(draggedOnWidget.id);
                  var11.packetBuffer.writeShortAdd(clickedWidget.itemId);
                  var11.packetBuffer.writeIntLE(clickedWidget.id);
                  var11.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex);
                  var11.packetBuffer.writeShortAddLE(draggedOnWidget.itemId);
                  var11.packetBuffer.writeShortLE(clickedWidget.childIndex);
                  packetWriter.addNode(var11);
               }
            } else if (this.shouldLeftClickOpenMenu()) {
               this.openMenu(field572 + widgetClickX, widgetClickY + field668);
            } else if (menuOptionsCount > 0) {
               int var10 = widgetClickX + field572;
               int var9 = widgetClickY + field668;
               UserComparator7.method2851(ViewportMouse.tempMenuAction, var10, var9);
               ViewportMouse.tempMenuAction = null;
            }

            clickedWidget = null;
         }

      } else {
         if (class371.widgetDragDuration > 1) {
            if (!isDraggingWidget && menuOptionsCount > 0) {
               var1 = widgetClickX + field572;
               var2 = widgetClickY + field668;
               UserComparator7.method2851(ViewportMouse.tempMenuAction, var1, var2);
               ViewportMouse.tempMenuAction = null;
            }

            clickedWidget = null;
         }

      }
   }

   @ObfuscatedName("nr")
   @ObfuscatedSignature(
      descriptor = "(B)Ltj;",
      garbageValue = "-45"
   )
   @Export("username")
   public Username username() {
      return BuddyRankComparator.localPlayer != null ? BuddyRankComparator.localPlayer.username : null;
   }

   public final void init() {
      try {
         if (this.checkHost()) {
            for(int var1 = 0; var1 <= 28; ++var1) {
               String var2 = this.getParameter(Integer.toString(var1));
               if (var2 != null) {
                  switch (var1) {
                     case 3:
                        if (var2.equalsIgnoreCase("true")) {
                           isMembersWorld = true;
                        } else {
                           isMembersWorld = false;
                        }
                        break;
                     case 4:
                        if (clientType == -1) {
                           clientType = Integer.parseInt(var2);
                        }
                        break;
                     case 5:
                        worldProperties = Integer.parseInt(var2);
                        break;
                     case 6:
                        int var4 = Integer.parseInt(var2);
                        Language var3;
                        if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
                           var3 = Language.Language_valuesOrdered[var4];
                        } else {
                           var3 = null;
                        }

                        class69.clientLanguage = var3;
                        break;
                     case 7:
                        class326.field3765 = class162.method3350(Integer.parseInt(var2));
                        break;
                     case 8:
                        if (var2.equalsIgnoreCase("true")) {
                        }
                        break;
                     case 9:
                        FontName.field4790 = var2;
                        break;
                     case 10:
                        DbTableType.field4870 = (StudioGame)SpriteMask.findEnumerated(SecureRandomFuture.method2124(), Integer.parseInt(var2));
                        if (StudioGame.oldscape == DbTableType.field4870) {
                           Occluder.loginType = LoginType.oldscape;
                        } else {
                           Occluder.loginType = LoginType.field4820;
                        }
                        break;
                     case 11:
                        class211.field2334 = var2;
                        break;
                     case 12:
                        worldId = Integer.parseInt(var2);
                     case 13:
                     case 16:
                     case 18:
                     case 19:
                     case 20:
                     case 22:
                     case 23:
                     case 24:
                     default:
                        break;
                     case 14:
                        RouteStrategy.field2330 = Integer.parseInt(var2);
                        break;
                     case 15:
                        gameBuild = Integer.parseInt(var2);
                        break;
                     case 17:
                        class199.field2088 = var2;
                        break;
                     case 21:
                        field486 = Integer.parseInt(var2);
                        break;
                     case 25:
                        int var5 = var2.indexOf(".");
                        if (var5 == -1) {
                           field557 = Integer.parseInt(var2);
                        } else {
                           field557 = Integer.parseInt(var2.substring(0, var5));
                           Integer.parseInt(var2.substring(var5 + 1));
                        }
                  }
               }
            }

            Scene.Scene_isLowDetail = false;
            isLowDetail = false;
            class188.worldHost = this.getCodeBase().getHost();
            String var6 = class326.field3765.name;
            byte var7 = 0;

            try {
               class87.method2286("oldschool", var6, var7, 22);
            } catch (Exception var8) {
               class364.RunException_sendStackTrace((String)null, var8);
            }

            class392.client = this;
            class458.clientType = clientType;
            ObjectComposition.method3878();
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
               this.field606 = true;
            }

            if (field488 == -1) {
               if (!this.method1222() && !this.method1223()) {
                  field488 = 0;
               } else {
                  field488 = 5;
               }
            }

            this.startThread(765, 503, 212, 1);
         }
      } catch (RuntimeException var9) {
         throw class9.newRunException(var9, "client.init(" + ')');
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
   )
   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (var1 != null) {
         this.field523 = var1;
         class14.method173(10);
      }
   }

   public boolean isOnLoginScreen() {
      return gameState == 10;
   }

   public long getAccountHash() {
      return this.field534;
   }

   @ObfuscatedSignature(
      descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
   )
   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.field527 = var1;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-89"
   )
   public static int method1780(int var0, int var1) {
      int var2;
      if (var1 > var0) {
         var2 = var0;
         var0 = var1;
         var1 = var2;
      }

      while(var1 != 0) {
         var2 = var0 % var1;
         var0 = var1;
         var1 = var2;
      }

      return var0;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-557966076"
   )
   @Export("iLog")
   public static int iLog(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "([FI)V",
      garbageValue = "-743757040"
   )
   static void method1778(float[] var0) {
      if (class123.field1459 + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * var2 * 4.0F));
         float var4 = 0.5F * (var3 + -var1);
         if (var0[1] + class123.field1459 > var4) {
            var0[1] = var4 - class123.field1459;
         } else {
            var4 = (-var1 - var3) * 0.5F;
            if (var0[1] < var4 + class123.field1459) {
               var0[1] = var4 + class123.field1459;
            }
         }
      } else {
         var0[0] = 1.3333334F - class123.field1459;
         var0[1] = 0.33333334F - class123.field1459;
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "92"
   )
   public static final void method1276(int var0, int var1) {
      ViewportMouse.ViewportMouse_x = var0;
      ViewportMouse.ViewportMouse_y = var1;
      ViewportMouse.ViewportMouse_isInViewport = true;
      ViewportMouse.ViewportMouse_entityCount = 0;
      ViewportMouse.ViewportMouse_false0 = false;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1744336849"
   )
   static void method1774() {
      if (IgnoreList.loadWorlds()) {
         Login.worldSelectOpen = true;
         Login.worldSelectPage = 0;
         Login.worldSelectPagesCount = 0;
      }

   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "367768395"
   )
   static int method1324(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = IgnoreList.loadWorlds() ? 1 : 0;
         return 1;
      } else {
         World var9;
         if (var0 == ScriptOpcodes.WORLDLIST_START) {
            var9 = FontName.worldListStart();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
            var9 = class467.getNextWorldListWorld();
            if (var9 != null) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var9.activity;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var9.host;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else {
            int var3;
            World var7;
            int var8;
            if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var7 = null;

               for(var8 = 0; var8 < World.World_count; ++var8) {
                  if (var3 == class260.World_worlds[var8].id) {
                     var7 = class260.World_worlds[var8];
                     break;
                  }
               }

               if (var7 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
               Interpreter.Interpreter_intStackSize -= 4;
               var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
               boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
               var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
               boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
               UrlRequest.sortWorldList(var3, var10, var8, var6);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                  followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                  return 1;
               } else {
                  int var4;
                  ParamComposition var5;
                  if (var0 == ScriptOpcodes.NC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = class153.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class188.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class188.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.LC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = class153.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = WallDecoration.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WallDecoration.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.OC_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = class153.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = ParamComposition.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ParamComposition.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
                     Interpreter.Interpreter_intStackSize -= 2;
                     var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                     var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                     var5 = class153.getParamDefinition(var4);
                     if (var5.isString()) {
                        Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = class269.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
                     } else {
                        Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class269.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ON_MOBILE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = onMobile ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CLIENTTYPE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = clientType;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                     return 1;
                  } else if (var0 == 6522) {
                     --HealthBar.Interpreter_stringStackSize;
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == 6523) {
                     --HealthBar.Interpreter_stringStackSize;
                     --Interpreter.Interpreter_intStackSize;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = field488;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (var3 >= 0 && var3 < World.World_count) {
                  var7 = class260.World_worlds[var3];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.activity;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var7.host;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
                  Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("lq")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)V",
      garbageValue = "775964682"
   )
   @Export("Widget_addToMenu")
   static final void Widget_addToMenu(Widget var0) {
      if (var0.buttonType == 1) {
         class123.method2924(var0.buttonText, "", 24, 0, 0, var0.id, var0.itemId);
      }

      String var1;
      if (var0.buttonType == 2 && !isSpellSelected) {
         var1 = Archive.Widget_getSpellActionName(var0);
         if (var1 != null) {
            class123.method2924(var1, Canvas.colorStartTag(65280) + var0.field3653, 25, 0, -1, var0.id, var0.itemId);
         }
      }

      if (var0.buttonType == 3) {
         class110.insertMenuItemNoShift("Close", "", 26, 0, 0, var0.id);
      }

      if (var0.buttonType == 4) {
         class110.insertMenuItemNoShift(var0.buttonText, "", 28, 0, 0, var0.id);
      }

      if (var0.buttonType == 5) {
         class110.insertMenuItemNoShift(var0.buttonText, "", 29, 0, 0, var0.id);
      }

      if (var0.buttonType == 6 && meslayerContinueWidget == null) {
         class110.insertMenuItemNoShift(var0.buttonText, "", 30, 0, -1, var0.id);
      }

      if (var0.isIf3) {
         if (isSpellSelected) {
            if (Clock.method3534(ParamComposition.getWidgetFlags(var0)) && (class90.selectedSpellFlags & 32) == 32) {
               class123.method2924(selectedSpellActionName, selectedSpellName + " " + "->" + " " + var0.dataText, 58, 0, var0.childIndex, var0.id, var0.itemId);
            }
         } else {
            for(int var4 = 9; var4 >= 5; --var4) {
               String var6 = WorldMapScaleHandler.method5373(var0, var4);
               if (var6 != null) {
                  class123.method2924(var6, var0.dataText, 1007, var4 + 1, var0.childIndex, var0.id, var0.itemId);
               }
            }

            var1 = Archive.Widget_getSpellActionName(var0);
            if (var1 != null) {
               class123.method2924(var1, var0.dataText, 25, 0, var0.childIndex, var0.id, var0.itemId);
            }

            for(int var2 = 4; var2 >= 0; --var2) {
               String var5 = WorldMapScaleHandler.method5373(var0, var2);
               if (var5 != null) {
                  class351.insertMenuItem(var5, var0.dataText, 57, var2 + 1, var0.childIndex, var0.id, var0.itemId, var0.prioritizeMenuEntry);
               }
            }

            int var3 = ParamComposition.getWidgetFlags(var0);
            boolean var7 = (var3 & 1) != 0;
            if (var7) {
               class110.insertMenuItemNoShift("Continue", "", 30, 0, var0.childIndex, var0.id);
            }
         }
      }

   }

   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-665812054"
   )
   static void method1777() {
      for(int var0 = 0; var0 < field745.size(); ++var0) {
         int var2 = (Integer)field745.get(var0);
         class134 var4 = (class134)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var2);
         class134 var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            AbstractArchive var6 = SequenceDefinition.SequenceDefinition_animationsArchive;
            AbstractArchive var7 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
            boolean var8 = true;
            byte[] var9 = var6.getFile(var2 >> 16 & '\uffff', var2 & '\uffff');
            class134 var5;
            if (var9 == null) {
               var8 = false;
               var5 = null;
            } else {
               int var10 = (var9[1] & 255) << 8 | var9[2] & 255;
               byte[] var11 = var7.getFile(var10, 0);
               if (var11 == null) {
                  var8 = false;
               }

               if (!var8) {
                  var5 = null;
               } else {
                  if (UserComparator7.field1413 == null) {
                     class134.field1573 = Runtime.getRuntime().availableProcessors();
                     UserComparator7.field1413 = new ThreadPoolExecutor(0, class134.field1573, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class134.field1573 * 100 + 100), new class69());
                  }

                  try {
                     var5 = new class134(var6, var7, var2, false);
                  } catch (Exception var13) {
                     var5 = null;
                  }
               }
            }

            if (var5 != null) {
               SequenceDefinition.SequenceDefinition_cachedModel.put(var5, (long)var2);
            }

            var3 = var5;
         }

         int var1;
         if (var3 == null) {
            var1 = 2;
         } else {
            var1 = var3.method3044() ? 0 : 1;
         }

         if (var1 != 2) {
            field745.remove(var0);
            --var0;
         }
      }

   }
}
