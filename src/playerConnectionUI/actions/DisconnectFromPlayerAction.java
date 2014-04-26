package playerConnectionUI.actions;

import connectionsModel.ConnectionModel;
import playerConnectionUI.Refreshable;
import status.checker.AvailableServer;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created with IntelliJ IDEA.
 * User: mcgui230
 * Date: 4/26/14
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class DisconnectFromPlayerAction extends AbstractAction {

    private AvailableServer availableServer;
    private ConnectionModel connectionModel;
    private Refreshable refreshable;

    public DisconnectFromPlayerAction(AvailableServer availableServer, ConnectionModel connectionModel, Refreshable refreshable) {
        super("Disconnect");
        this.availableServer = availableServer;
        this.connectionModel = connectionModel;
        this.refreshable = refreshable;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        connectionModel.removeConnection(availableServer.getIpAddress());
        refreshable.refresh();
    }
}
