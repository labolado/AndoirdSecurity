.class Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState$1;
.super Ljava/lang/Object;
.source "CirclePageIndicator.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 432
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;
    .locals 2

    .prologue
    .line 435
    new-instance v0, Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;-><init>(Landroid/os/Parcel;Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState$1;->createFromParcel(Landroid/os/Parcel;)Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;
    .locals 1

    .prologue
    .line 440
    new-array v0, p1, [Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState$1;->newArray(I)[Lcom/alipay/android/launcher/guide/CirclePageIndicator$SavedState;

    move-result-object v0

    return-object v0
.end method