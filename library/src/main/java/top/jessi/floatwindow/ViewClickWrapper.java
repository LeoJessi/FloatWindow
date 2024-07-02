package top.jessi.floatwindow;

import android.view.View;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyWindow
 *    time   : 2019/01/04
 *    desc   : {@link View.OnClickListener} 包装类
 */
@SuppressWarnings("rawtypes")
final class ViewClickWrapper implements View.OnClickListener {

    private final FloatWindow<?> mFloatWindow;
    private final FloatWindow.OnClickListener mListener;

    ViewClickWrapper(FloatWindow<?> floatWindow, FloatWindow.OnClickListener listener) {
        mFloatWindow = floatWindow;
        mListener = listener;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onClick(View view) {
        if (mListener == null) {
            return;
        }
        mListener.onClick(mFloatWindow, view);
    }
}